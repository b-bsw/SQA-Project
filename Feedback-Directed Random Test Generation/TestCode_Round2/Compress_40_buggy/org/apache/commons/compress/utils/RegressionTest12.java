package org.apache.commons.compress.utils;

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
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        long long17 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long23 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass21 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits((int) (byte) 0);
        long long19 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long26 = bitInputStream2.readBits(0);
        long long28 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long30 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (short) 0);
        long long14 = bitInputStream2.readBits(0);
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits((int) (short) 0);
        long long21 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long25 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long29 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long9 = bitInputStream2.readBits(0);
        long long11 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits((int) (byte) 0);
        long long9 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits((int) (short) 0);
        long long20 = bitInputStream2.readBits(0);
        long long22 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long26 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long28 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        long long19 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long25 = bitInputStream2.readBits((int) (short) 0);
        long long27 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long23 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        long long17 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long25 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass19 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        long long17 = bitInputStream2.readBits((int) (short) 0);
        java.lang.Class<?> wildcardClass18 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long9 = bitInputStream2.readBits(0);
        long long11 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass14 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long29 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long33 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass17 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long29 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass33 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        long long16 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        long long16 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        long long19 = bitInputStream2.readBits(0);
        long long21 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass26 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        long long17 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits((int) (byte) 0);
        long long19 = bitInputStream2.readBits((int) (byte) 0);
        long long21 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long9 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass14 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits((int) (byte) 0);
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits(0);
        long long16 = bitInputStream2.readBits(0);
        long long18 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long27 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass29 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long30 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long25 = bitInputStream2.readBits((int) (short) 0);
        long long27 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long25 = bitInputStream2.readBits(0);
        long long27 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (short) 0);
        long long24 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long9 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (short) 0);
        long long14 = bitInputStream2.readBits(0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits((int) (short) 0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass17 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        long long21 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits((int) (byte) 0);
        long long18 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        long long17 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits(0);
        long long22 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        long long17 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long25 = bitInputStream2.readBits(0);
        long long27 = bitInputStream2.readBits(0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits(0);
        long long14 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        long long19 = bitInputStream2.readBits(0);
        long long21 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        long long17 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits(0);
        long long22 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        long long17 = bitInputStream2.readBits(0);
        long long19 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long25 = bitInputStream2.readBits((int) (short) 0);
        long long27 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass28 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits((int) (short) 0);
        long long22 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits(0);
        long long9 = bitInputStream2.readBits((int) (byte) 0);
        long long11 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass24 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        long long18 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long23 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long26 = bitInputStream2.readBits((int) (short) 0);
        long long28 = bitInputStream2.readBits((int) (byte) 0);
        java.lang.Class<?> wildcardClass29 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (short) 0);
        long long24 = bitInputStream2.readBits((int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        long long19 = bitInputStream2.readBits(0);
        long long21 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long27 = bitInputStream2.readBits((int) (short) 0);
        java.lang.Class<?> wildcardClass28 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits(0);
        long long14 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass19 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6092");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6093");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long27 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long29 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6094");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long25 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long32 = bitInputStream2.readBits((int) (short) 0);
        long long34 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long36 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6095");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6096");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        long long19 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6097");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6098");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long7 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6099");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long28 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass29 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6100");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long9 = bitInputStream2.readBits(0);
        long long11 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6101");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6102");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        long long16 = bitInputStream2.readBits((int) (short) 0);
        long long18 = bitInputStream2.readBits(0);
        long long20 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6103");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6104");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass21 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6105");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        long long17 = bitInputStream2.readBits((int) (short) 0);
        long long19 = bitInputStream2.readBits((int) (short) 0);
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6106");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits((int) (byte) 0);
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6107");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6108");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6109");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6110");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long7 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6111");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long9 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6112");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long7 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6113");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        long long17 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits(0);
        long long22 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6114");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long23 = bitInputStream2.readBits(0);
        long long25 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6115");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6116");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        long long19 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (short) 0);
        long long24 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6117");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6118");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long27 = bitInputStream2.readBits(0);
        long long29 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long32 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6119");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6120");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        long long18 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits(0);
        long long24 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass26 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6121");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        long long17 = bitInputStream2.readBits(0);
        long long19 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6122");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits(0);
        long long26 = bitInputStream2.readBits(0);
        long long28 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long30 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6123");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long25 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass28 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6124");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (byte) 0);
        long long16 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6125");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (short) 0);
        long long14 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6126");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6127");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (byte) 0);
        long long14 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6128");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        long long19 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6129");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        long long18 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6130");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits((int) (short) 0);
        long long18 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6131");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6132");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6133");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long23 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6134");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        long long15 = bitInputStream2.readBits((int) (short) 0);
        long long17 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6135");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (short) 0);
        long long14 = bitInputStream2.readBits(0);
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long23 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long29 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6136");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long9 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6137");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6138");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6139");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits((int) (short) 0);
        java.lang.Class<?> wildcardClass21 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6140");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long28 = bitInputStream2.readBits(0);
        long long30 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6141");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        long long16 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6142");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6143");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long9 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass15 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6144");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6145");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits((int) (short) 0);
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6146");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        long long18 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6147");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits((int) (short) 0);
        long long21 = bitInputStream2.readBits((int) (byte) 0);
        long long23 = bitInputStream2.readBits((int) (short) 0);
        long long25 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6148");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits((int) (short) 0);
        long long20 = bitInputStream2.readBits(0);
        long long22 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6149");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6150");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        long long19 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits(0);
        long long24 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6151");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6152");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long7 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6153");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6154");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (short) 0);
        long long14 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6155");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        long long17 = bitInputStream2.readBits(0);
        long long19 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6156");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits((int) (short) 0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6157");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        long long18 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6158");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6159");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6160");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits((int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6161");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        long long16 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6162");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        long long19 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits(0);
        long long24 = bitInputStream2.readBits((int) (short) 0);
        long long26 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long29 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass31 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6163");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits((int) (byte) 0);
        long long19 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long28 = bitInputStream2.readBits((int) (byte) 0);
        java.lang.Class<?> wildcardClass29 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6164");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6165");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6166");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits(0);
        long long26 = bitInputStream2.readBits(0);
        long long28 = bitInputStream2.readBits(0);
        long long30 = bitInputStream2.readBits(0);
        long long32 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass36 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6167");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6168");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6169");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6170");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        long long19 = bitInputStream2.readBits(0);
        long long21 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long28 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6171");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        long long16 = bitInputStream2.readBits(0);
        long long18 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits((int) (short) 0);
        long long23 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6172");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long25 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long31 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6173");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        long long19 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits(0);
        long long24 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long31 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6174");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6175");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        long long15 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6176");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6177");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long25 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long28 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6178");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        long long16 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6179");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (byte) 0);
        long long17 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6180");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long28 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long33 = bitInputStream2.readBits((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6181");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits((int) (short) 0);
        long long20 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6182");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6183");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6184");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (short) 0);
        long long14 = bitInputStream2.readBits(0);
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6185");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits((int) (byte) 0);
        long long23 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6186");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits((int) (short) 0);
        long long18 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6187");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass21 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6188");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6189");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        long long16 = bitInputStream2.readBits((int) (short) 0);
        long long18 = bitInputStream2.readBits(0);
        long long20 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long23 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6190");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        long long17 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits(0);
        long long22 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6191");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits((int) (byte) 0);
        long long19 = bitInputStream2.readBits((int) (byte) 0);
        long long21 = bitInputStream2.readBits(0);
        long long23 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6192");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6193");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6194");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long23 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6195");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        long long18 = bitInputStream2.readBits(0);
        long long20 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6196");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits(0);
        long long9 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass15 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6197");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6198");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long27 = bitInputStream2.readBits(0);
        long long29 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long33 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test6199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6199");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits((int) (byte) 0);
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test6200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6200");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits((int) (short) 0);
        long long23 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test6201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6201");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test6202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6202");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits((int) (short) 0);
        long long21 = bitInputStream2.readBits((int) (byte) 0);
        long long23 = bitInputStream2.readBits((int) (short) 0);
        long long25 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test6203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6203");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6204");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        long long16 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6205");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test6206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6206");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        long long17 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6207");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6208");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6209");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test6210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6210");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long7 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test6211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6211");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (short) 0);
        long long24 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6212");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6213");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6214");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        long long18 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long27 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long29 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test6215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6215");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6216");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6217");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        long long19 = bitInputStream2.readBits(0);
        long long21 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test6218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6218");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long26 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long29 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test6219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6219");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long23 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test6220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6220");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (short) 0);
        long long14 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6221");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        long long15 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test6222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6222");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits(0);
        long long26 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long29 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test6223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6223");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long29 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test6224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6224");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        long long17 = bitInputStream2.readBits(0);
        long long19 = bitInputStream2.readBits((int) (short) 0);
        long long21 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test6225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6225");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6226");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test6227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6227");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long7 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test6228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6228");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits(0);
        long long26 = bitInputStream2.readBits(0);
        long long28 = bitInputStream2.readBits(0);
        long long30 = bitInputStream2.readBits(0);
        long long32 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test6229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6229");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (short) 0);
        long long14 = bitInputStream2.readBits(0);
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass26 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6230");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits(0);
        long long9 = bitInputStream2.readBits((int) (byte) 0);
        long long11 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass12 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6231");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6232");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test6233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6233");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits(0);
        long long14 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass16 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6234");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long30 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long33 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test6235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6235");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test6236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6236");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long9 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test6237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6237");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test6238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6238");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        long long17 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6239");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        long long17 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long25 = bitInputStream2.readBits(0);
        long long27 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long29 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test6240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6240");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test6241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6241");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (short) 0);
        long long14 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6242");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long30 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6243");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6244");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test6245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6245");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (short) 0);
        long long14 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test6246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6246");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits((int) (short) 0);
        long long23 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long27 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long29 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test6247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6247");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long23 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6248");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        long long18 = bitInputStream2.readBits(0);
        long long20 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6249");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass16 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6250");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test6251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6251");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test6252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6252");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (short) 0);
        long long14 = bitInputStream2.readBits(0);
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test6253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6253");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6254");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long25 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test6255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6255");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long7 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test6256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6256");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        long long17 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6257");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6258");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test6259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6259");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        long long17 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6260");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test6261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6261");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test6262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6262");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits((int) (short) 0);
        long long23 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long27 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long31 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass32 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test6263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6263");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        long long17 = bitInputStream2.readBits(0);
        long long19 = bitInputStream2.readBits((int) (short) 0);
        long long21 = bitInputStream2.readBits(0);
        long long23 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass24 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6264");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits((int) (byte) 0);
        long long18 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6265");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6266");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits((int) (short) 0);
        long long23 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test6267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6267");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (short) 0);
        long long24 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6268");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        long long16 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6269");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        long long18 = bitInputStream2.readBits(0);
        long long20 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6270");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits((int) (byte) 0);
        long long19 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6271");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6272");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long25 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long29 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long32 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test6273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6273");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long25 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long32 = bitInputStream2.readBits((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test6274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6274");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (short) 0);
        long long14 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6275");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass24 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6276");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (short) 0);
        long long14 = bitInputStream2.readBits(0);
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits(0);
        long long23 = bitInputStream2.readBits(0);
        long long25 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test6277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6277");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        long long16 = bitInputStream2.readBits((int) (short) 0);
        long long18 = bitInputStream2.readBits(0);
        long long20 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6278");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test6279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6279");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits((int) (byte) 0);
        long long19 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6280");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6281");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits((int) (byte) 0);
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        long long18 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6282");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        long long19 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long26 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test6283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6283");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6284");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long9 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass13 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6285");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        long long17 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6286");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6287");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        long long21 = bitInputStream2.readBits(0);
        long long23 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test6288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6288");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits(0);
        long long26 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long31 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test6289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6289");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test6290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6290");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long23 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test6291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6291");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        long long21 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test6292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6292");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6293");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (short) 0);
        long long14 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long25 = bitInputStream2.readBits((int) (short) 0);
        long long27 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long30 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test6294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6294");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits((int) (byte) 0);
        long long9 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test6295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6295");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6296");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        long long17 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long25 = bitInputStream2.readBits(0);
        long long27 = bitInputStream2.readBits((int) (byte) 0);
        java.lang.Class<?> wildcardClass28 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6297");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test6298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6298");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass13 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6299");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test6300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6300");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test6301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6301");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        long long17 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass21 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6302");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test6303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6303");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long26 = bitInputStream2.readBits(0);
        long long28 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass29 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6304");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        long long17 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6305");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (short) 0);
        long long14 = bitInputStream2.readBits(0);
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long25 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test6306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6306");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        long long19 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long26 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test6307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6307");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits((int) (byte) 0);
        long long12 = bitInputStream2.readBits(0);
        long long14 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass17 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6308");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6309");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long7 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits(0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6310");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        long long18 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass27 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6311");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (short) 0);
        long long14 = bitInputStream2.readBits(0);
        long long16 = bitInputStream2.readBits((int) (byte) 0);
        long long18 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6312");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        long long16 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test6313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6313");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long23 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass24 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6314");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6315");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6316");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits((int) (byte) 0);
        long long21 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6317");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        long long19 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6318");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test6319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6319");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6320");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits(0);
        long long26 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long31 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long35 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test6321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6321");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits(0);
        long long14 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass18 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6322");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6323");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6324");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test6325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6325");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits((int) (byte) 0);
        long long12 = bitInputStream2.readBits(0);
        long long14 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test6326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6326");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long25 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long31 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long34 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test6327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6327");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6328");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test6329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6329");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test6330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6330");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass21 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6331");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long25 = bitInputStream2.readBits(0);
        long long27 = bitInputStream2.readBits(0);
        long long29 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long31 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test6332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6332");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6333");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (short) 0);
        long long14 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        long long19 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6334");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits((int) (short) 0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (byte) 0);
        long long14 = bitInputStream2.readBits(0);
        long long16 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test6335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6335");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits((int) (byte) 0);
        long long21 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test6336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6336");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass28 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6337");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        long long16 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long26 = bitInputStream2.readBits(0);
        long long28 = bitInputStream2.readBits((int) (byte) 0);
        long long30 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test6338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6338");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        long long18 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits((int) (byte) 0);
        long long23 = bitInputStream2.readBits(0);
        long long25 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long28 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass29 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6339");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6340");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6341");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits((int) (short) 0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (byte) 0);
        long long14 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass17 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6342");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test6343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6343");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long23 = bitInputStream2.readBits(0);
        long long25 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test6344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6344");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        long long17 = bitInputStream2.readBits((int) (short) 0);
        long long19 = bitInputStream2.readBits((int) (short) 0);
        long long21 = bitInputStream2.readBits((int) (short) 0);
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6345");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        long long15 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test6346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6346");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        long long17 = bitInputStream2.readBits(0);
        long long19 = bitInputStream2.readBits((int) (short) 0);
        long long21 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long28 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test6347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6347");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6348");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6349");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits((int) (short) 0);
        long long20 = bitInputStream2.readBits(0);
        long long22 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6350");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test6351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6351");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6352");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits(0);
        long long9 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        long long14 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test6353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6353");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long25 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test6354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6354");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6355");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long23 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6356");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        long long19 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits(0);
        long long24 = bitInputStream2.readBits((int) (short) 0);
        long long26 = bitInputStream2.readBits(0);
        long long28 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long30 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test6357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6357");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (short) 0);
        long long14 = bitInputStream2.readBits(0);
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long23 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long28 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test6358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6358");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        long long18 = bitInputStream2.readBits((int) (byte) 0);
        long long20 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass27 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6359");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test6360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6360");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits((int) (short) 0);
        long long23 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long27 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long30 = bitInputStream2.readBits(0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test6361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6361");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        long long19 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long25 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass29 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6362");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test6363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6363");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6364");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long7 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass15 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6365");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits((int) (short) 0);
        long long23 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long30 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test6366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6366");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass17 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6367");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long27 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long30 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test6368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6368");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits((int) (byte) 0);
        long long12 = bitInputStream2.readBits(0);
        long long14 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test6369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6369");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6370");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test6371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6371");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6372");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test6373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6373");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test6374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6374");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test6375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6375");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        long long21 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test6376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6376");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (short) 0);
        long long14 = bitInputStream2.readBits(0);
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long23 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long28 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long30 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test6377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6377");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test6378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6378");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        long long18 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6379");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits((int) (short) 0);
        long long21 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test6380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6380");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long25 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test6381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6381");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits((int) (byte) 0);
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test6382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6382");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (short) 0);
        long long14 = bitInputStream2.readBits(0);
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6383");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6384");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits(0);
        long long26 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long31 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long35 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test6385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6385");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6386");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6387");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long27 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long30 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass31 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6388");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6389");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long28 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test6390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6390");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits(0);
        long long22 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6391");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        long long17 = bitInputStream2.readBits(0);
        long long19 = bitInputStream2.readBits((int) (short) 0);
        long long21 = bitInputStream2.readBits(0);
        long long23 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test6392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6392");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits((int) (byte) 0);
        long long12 = bitInputStream2.readBits(0);
        long long14 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass21 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6393");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass12 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6394");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits(0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6395");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (short) 0);
        long long14 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long28 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6396");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long29 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long31 = bitInputStream2.readBits((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test6397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6397");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test6398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6398");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long26 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test6399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6399");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long28 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6400");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6401");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long23 = bitInputStream2.readBits((int) (byte) 0);
        long long25 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long28 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test6402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6402");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long28 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6403");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        long long21 = bitInputStream2.readBits((int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6404");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        long long17 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6405");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        long long17 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6406");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        long long19 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits(0);
        long long24 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6407");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long30 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass31 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6408");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test6409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6409");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        long long19 = bitInputStream2.readBits(0);
        long long21 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test6410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6410");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits(0);
        long long9 = bitInputStream2.readBits(0);
        long long11 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test6411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6411");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        long long18 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits((int) (short) 0);
        long long23 = bitInputStream2.readBits(0);
        long long25 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test6412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6412");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long9 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (short) 0);
        java.lang.Class<?> wildcardClass13 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6413");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6414");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (short) 0);
        long long14 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long28 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6415");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        long long18 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits(0);
        long long23 = bitInputStream2.readBits(0);
        long long25 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test6416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6416");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass15 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6417");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6418");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long9 = bitInputStream2.readBits(0);
        long long11 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test6419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6419");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        long long18 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long25 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test6420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6420");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test6421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6421");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        long long17 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6422");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test6423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6423");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long25 = bitInputStream2.readBits(0);
        long long27 = bitInputStream2.readBits(0);
        long long29 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test6424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6424");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test6425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6425");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6426");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6427");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        long long21 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test6428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6428");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test6429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6429");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test6430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6430");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6431");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test6432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6432");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long23 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test6433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6433");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long27 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long29 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test6434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6434");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        long long16 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6435");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long9 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass11 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6436");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        long long17 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6437");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        long long17 = bitInputStream2.readBits(0);
        long long19 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass26 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6438");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test6439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6439");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6440");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long26 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test6441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6441");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test6442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6442");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long28 = bitInputStream2.readBits(0);
        long long30 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long32 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test6443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6443");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        long long18 = bitInputStream2.readBits((int) (byte) 0);
        long long20 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass26 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6444");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits((int) (short) 0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (byte) 0);
        long long14 = bitInputStream2.readBits(0);
        long long16 = bitInputStream2.readBits(0);
        long long18 = bitInputStream2.readBits((int) (short) 0);
        long long20 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6445");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long27 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test6446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6446");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        long long17 = bitInputStream2.readBits(0);
        long long19 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6447");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6448");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass17 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6449");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (short) 0);
        long long14 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits(0);
        long long23 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test6450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6450");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        long long17 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits(0);
        long long22 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6451");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6452");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test6453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6453");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits((int) (byte) 0);
        long long23 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass24 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6454");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6455");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long7 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test6456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6456");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits((int) (short) 0);
        java.lang.Class<?> wildcardClass21 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6457");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test6458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6458");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        long long19 = bitInputStream2.readBits(0);
        long long21 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long29 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long31 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test6459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6459");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits((int) (byte) 0);
        long long9 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test6460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6460");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long27 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long29 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test6461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6461");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits(0);
        long long26 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test6462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6462");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long9 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits(0);
        long long20 = bitInputStream2.readBits((int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6463");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        long long21 = bitInputStream2.readBits((int) (short) 0);
        long long23 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test6464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6464");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6465");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6466");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long27 = bitInputStream2.readBits((int) (short) 0);
        long long29 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test6467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6467");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long25 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test6468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6468");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass24 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6469");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test6470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6470");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6471");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long29 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test6472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6472");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test6473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6473");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        long long15 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test6474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6474");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        long long16 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long26 = bitInputStream2.readBits(0);
        long long28 = bitInputStream2.readBits((int) (byte) 0);
        long long30 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass32 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test6475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6475");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6476");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        long long16 = bitInputStream2.readBits((int) (short) 0);
        long long18 = bitInputStream2.readBits(0);
        long long20 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long23 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass26 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6477");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        long long19 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6478");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits(0);
        long long22 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6479");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6480");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits((int) (byte) 0);
        long long12 = bitInputStream2.readBits(0);
        long long14 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6481");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6482");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long27 = bitInputStream2.readBits(0);
        long long29 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long32 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test6483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6483");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits((int) (short) 0);
        long long17 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6484");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test6485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6485");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits((int) (byte) 0);
        long long21 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test6486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6486");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6487");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test6488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6488");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        long long19 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits(0);
        long long24 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long28 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6489");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits((int) (byte) 0);
        long long23 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long29 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test6490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6490");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test6491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6491");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test6492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6492");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits(0);
        long long14 = bitInputStream2.readBits((int) (short) 0);
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6493");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6494");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long20 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long25 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test6495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6495");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits(0);
        long long20 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6496");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass21 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6497");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits((int) (byte) 0);
        long long14 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass15 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6498");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits((int) (short) 0);
        long long15 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test6499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6499");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long15 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits((int) (short) 0);
        long long20 = bitInputStream2.readBits(0);
        long long22 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long26 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass29 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6500");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long26 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long28 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }
}

