package org.apache.commons.compress.utils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

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
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
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
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits(10);
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
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
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
            bitInputStream2.close();
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
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
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
        long long22 = bitInputStream2.readBits(0);
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
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
        long long21 = bitInputStream2.readBits((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) (short) 10);
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
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
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
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits((int) (short) 10);
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
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
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
        long long18 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) ' ');
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
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
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
        long long14 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
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
        java.lang.Class<?> wildcardClass28 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
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
        long long18 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
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
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
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
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long9 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = bitInputStream2.readBits((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
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
            long long23 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
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
            long long24 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
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
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
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
        java.lang.Class<?> wildcardClass18 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
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
        long long17 = bitInputStream2.readBits(0);
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
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
        long long22 = bitInputStream2.readBits((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) ' ');
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
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
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
        bitInputStream2.clearBitCache();
        long long26 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass27 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
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
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
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
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
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
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
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
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
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
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (byte) 0);
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
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass27 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
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
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
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
        java.lang.Class<?> wildcardClass21 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) (short) -1);
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
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
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
        long long19 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
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
        long long15 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
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
            long long29 = bitInputStream2.readBits(100);
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
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
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
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
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
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
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) (byte) 10);
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
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
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
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
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
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
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
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) '#');
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
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
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
            long long20 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
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
        bitInputStream2.clearBitCache();
        long long29 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long31 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
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
        java.lang.Class<?> wildcardClass27 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long7 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) (byte) 10);
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
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
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
            long long26 = bitInputStream2.readBits((int) (byte) 10);
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
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass24 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
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
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) '4');
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
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
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
        java.lang.Class<?> wildcardClass26 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
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
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
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
        long long16 = bitInputStream2.readBits((int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
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
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits((int) '#');
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
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
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
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
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
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
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
        long long17 = bitInputStream2.readBits(0);
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
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
        long long21 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bitInputStream2.readBits(10);
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
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
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
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        long long21 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass21 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
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
        java.lang.Class<?> wildcardClass15 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
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
        long long19 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass21 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
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
        // The following exception was thrown during execution in test generation
        try {
            long long15 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
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
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
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
        bitInputStream2.clearBitCache();
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits((int) (byte) -1);
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
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
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
            long long20 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
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
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
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
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass26 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
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
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
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
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
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
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) '#');
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
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
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
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
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
        long long16 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
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
        // The following exception was thrown during execution in test generation
        try {
            long long15 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits(0);
        long long9 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits(0);
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
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
        bitInputStream2.clearBitCache();
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass21 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
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
        bitInputStream2.clearBitCache();
        long long25 = bitInputStream2.readBits(0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
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
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
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
        bitInputStream2.clearBitCache();
        long long29 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long31 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
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
            long long25 = bitInputStream2.readBits((int) (short) -1);
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
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
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
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
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
        long long16 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) (short) 1);
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
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
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
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits(10);
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
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
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
        long long13 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
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
        // The following exception was thrown during execution in test generation
        try {
            long long15 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
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
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) (short) 10);
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
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
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
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass24 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
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
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
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
            long long17 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
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
            long long29 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
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
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
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
        long long18 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long28 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
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
        // The following exception was thrown during execution in test generation
        try {
            long long30 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
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
        long long19 = bitInputStream2.readBits(0);
        long long21 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
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
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
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
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
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
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
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
        long long21 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass24 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
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
        long long16 = bitInputStream2.readBits(0);
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
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
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
        // The following exception was thrown during execution in test generation
        try {
            long long14 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass24 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
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
        bitInputStream2.clearBitCache();
        long long17 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits(1);
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
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits((int) (byte) 0);
        long long9 = bitInputStream2.readBits((int) (byte) 0);
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
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long9 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass13 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
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
            long long13 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
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
        long long21 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) '4');
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
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass19 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long28 = bitInputStream2.readBits((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
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
        long long26 = bitInputStream2.readBits((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
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
        long long17 = bitInputStream2.readBits(0);
        long long19 = bitInputStream2.readBits((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
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
        java.lang.Class<?> wildcardClass18 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
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
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
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
        // The following exception was thrown during execution in test generation
        try {
            long long15 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
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
        java.lang.Class<?> wildcardClass15 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
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
        java.lang.Class<?> wildcardClass16 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
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
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass24 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
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
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits((int) (byte) 10);
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
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
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
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass21 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
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
            bitInputStream2.close();
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
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass21 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
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
        java.lang.Class<?> wildcardClass18 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
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
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
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
            long long17 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
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
        long long26 = bitInputStream2.readBits(0);
        long long28 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass29 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
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
        bitInputStream2.clearBitCache();
        long long29 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long32 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
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
        long long25 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass26 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
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
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
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
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
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
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
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
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
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
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits((int) '4');
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
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
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
        long long20 = bitInputStream2.readBits(0);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
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
        // The following exception was thrown during execution in test generation
        try {
            long long14 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) '#');
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
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
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
            long long30 = bitInputStream2.readBits((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) (short) 1);
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
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
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
        bitInputStream2.clearBitCache();
        long long29 = bitInputStream2.readBits((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
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
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) (short) 100);
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
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
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
        // The following exception was thrown during execution in test generation
        try {
            long long15 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
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
        long long13 = bitInputStream2.readBits(0);
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
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
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
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        long long21 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
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
        long long18 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long9 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
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
        java.lang.Class<?> wildcardClass14 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
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
        // The following exception was thrown during execution in test generation
        try {
            long long28 = bitInputStream2.readBits((int) (byte) 1);
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
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
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
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
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
            long long21 = bitInputStream2.readBits((-1));
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
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
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
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits((int) (byte) 1);
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
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits((int) (byte) 10);
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
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
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
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
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
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
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
            long long18 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
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
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
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
        // The following exception was thrown during execution in test generation
        try {
            long long29 = bitInputStream2.readBits((int) (byte) 1);
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
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long7 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
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
        long long17 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
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
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
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
        java.lang.Class<?> wildcardClass24 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
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
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
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
        bitInputStream2.clearBitCache();
        long long23 = bitInputStream2.readBits((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
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
            long long18 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
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
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
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
        long long16 = bitInputStream2.readBits((int) (short) 0);
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
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
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
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
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
        long long24 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass26 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
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
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
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
        // The following exception was thrown during execution in test generation
        try {
            long long14 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
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
            long long17 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
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
        long long23 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
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
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits((int) 'a');
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
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits(0);
        long long9 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
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
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
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
        java.lang.Class<?> wildcardClass19 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
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
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) (short) 10);
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
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
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
        // The following exception was thrown during execution in test generation
        try {
            long long29 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
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
        long long22 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
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
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits(0);
        long long23 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
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
            long long13 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
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
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
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
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
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
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
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
        // The following exception was thrown during execution in test generation
        try {
            long long28 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
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
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
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
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long9 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
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
        long long23 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long29 = bitInputStream2.readBits((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass19 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
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
        java.lang.Class<?> wildcardClass30 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long9 = bitInputStream2.readBits((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
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
        java.lang.Class<?> wildcardClass28 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
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
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
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
        long long15 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
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
        long long17 = bitInputStream2.readBits(0);
        long long19 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass17 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
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
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) (byte) 100);
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
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
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
        long long22 = bitInputStream2.readBits((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
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
            long long23 = bitInputStream2.readBits((int) '#');
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
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
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
        long long16 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
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
        long long20 = bitInputStream2.readBits((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long9 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long9 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
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
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass26 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long9 = bitInputStream2.readBits((int) (short) 0);
        long long11 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass13 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits((int) (short) 0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass13 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
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
        java.lang.Class<?> wildcardClass27 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
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
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass17 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
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
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits(0);
        long long23 = bitInputStream2.readBits((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
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
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits(10);
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
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
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
        long long22 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
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
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = bitInputStream2.readBits((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
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
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits(0);
        long long9 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass12 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
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
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
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
        long long28 = bitInputStream2.readBits(0);
        long long30 = bitInputStream2.readBits((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
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
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) (short) 1);
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
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
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
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
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
            bitInputStream2.close();
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
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
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
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits(100);
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
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
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
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
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
        long long18 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
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
        long long25 = bitInputStream2.readBits(0);
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long7 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
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
        long long27 = bitInputStream2.readBits((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long7 = bitInputStream2.readBits(0);
        long long9 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
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
        java.lang.Class<?> wildcardClass18 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
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
        long long17 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass18 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
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
            long long26 = bitInputStream2.readBits(1);
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
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
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
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) (short) 10);
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
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
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
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
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
            long long15 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
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
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
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
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((int) (byte) 1);
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
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
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
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
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
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
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
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
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
        // The following exception was thrown during execution in test generation
        try {
            long long31 = bitInputStream2.readBits((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
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
        long long21 = bitInputStream2.readBits(0);
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
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
        long long17 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass19 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
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
        long long26 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long30 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
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
        // The following exception was thrown during execution in test generation
        try {
            long long15 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
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
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
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
        java.lang.Class<?> wildcardClass26 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
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
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
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
            long long16 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
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
        java.lang.Class<?> wildcardClass12 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
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
        java.lang.Class<?> wildcardClass27 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
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
            long long18 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
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
        long long16 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) '4');
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
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
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
        long long18 = bitInputStream2.readBits((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
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
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
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
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
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
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long18 = bitInputStream2.readBits((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
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
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits(10);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
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
        java.lang.Class<?> wildcardClass16 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
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
        // The following exception was thrown during execution in test generation
        try {
            long long15 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
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
        long long20 = bitInputStream2.readBits((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
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
        java.lang.Class<?> wildcardClass21 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits(0);
        long long9 = bitInputStream2.readBits(0);
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
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
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
            long long28 = bitInputStream2.readBits(1);
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
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
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
        java.lang.Class<?> wildcardClass14 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
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
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
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
        long long17 = bitInputStream2.readBits(0);
        long long19 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long29 = bitInputStream2.readBits((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
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
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass24 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
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
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
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
        long long21 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits((int) 'a');
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
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
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
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
        long long24 = bitInputStream2.readBits((int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
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
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
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
        java.lang.Class<?> wildcardClass15 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
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
        java.lang.Class<?> wildcardClass32 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
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
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
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
        long long17 = bitInputStream2.readBits(0);
        long long19 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
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
        java.lang.Class<?> wildcardClass27 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
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
        java.lang.Class<?> wildcardClass26 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
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
        long long20 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long9 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
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
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
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
        java.lang.Class<?> wildcardClass31 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
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
        long long22 = bitInputStream2.readBits(0);
        long long24 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
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
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
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
        long long24 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
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
        long long17 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass19 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
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
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
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
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
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
        java.lang.Class<?> wildcardClass34 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
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
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
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
        java.lang.Class<?> wildcardClass14 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
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
        long long16 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) (byte) 1);
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
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
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
        long long27 = bitInputStream2.readBits((int) (short) 0);
        java.lang.Class<?> wildcardClass28 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
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
        java.lang.Class<?> wildcardClass28 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
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
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
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
            long long17 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
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
        long long20 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
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
        long long19 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits((int) ' ');
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
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long32 = bitInputStream2.readBits((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
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
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
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
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
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
        long long15 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
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
            long long24 = bitInputStream2.readBits((int) '4');
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
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
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
        java.lang.Class<?> wildcardClass27 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
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
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
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
        java.lang.Class<?> wildcardClass17 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
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
        long long17 = bitInputStream2.readBits(0);
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
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
        long long16 = bitInputStream2.readBits((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
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
        long long21 = bitInputStream2.readBits((int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long9 = bitInputStream2.readBits((int) (short) 0);
        long long11 = bitInputStream2.readBits(0);
        long long13 = bitInputStream2.readBits((int) (short) 0);
        java.lang.Class<?> wildcardClass14 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
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
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
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
        // The following exception was thrown during execution in test generation
        try {
            long long30 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
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
        java.lang.Class<?> wildcardClass28 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
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
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
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
        bitInputStream2.clearBitCache();
        long long27 = bitInputStream2.readBits(0);
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
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
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
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
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
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
        long long22 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long26 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass29 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
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
        java.lang.Class<?> wildcardClass14 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
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
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
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
        long long28 = bitInputStream2.readBits(0);
        long long30 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass33 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
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
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
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
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
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
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits((int) (byte) -1);
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
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) (short) 10);
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
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
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
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long9 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
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
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
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
        long long13 = bitInputStream2.readBits((int) (byte) 0);
        java.lang.Class<?> wildcardClass14 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
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
        java.lang.Class<?> wildcardClass29 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
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
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
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
        long long21 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits(1);
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
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
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
        long long14 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
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
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) (byte) 1);
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
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
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
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
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
        java.lang.Class<?> wildcardClass24 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
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
        long long20 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass21 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long26 = bitInputStream2.readBits((int) (short) 0);
        java.lang.Class<?> wildcardClass27 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
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
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
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
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits(0);
        long long9 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
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
        long long19 = bitInputStream2.readBits(0);
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
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
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
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
            long long25 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
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
        // The following exception was thrown during execution in test generation
        try {
            long long14 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
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
        long long14 = bitInputStream2.readBits((int) (byte) 0);
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
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
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
        long long23 = bitInputStream2.readBits(0);
        long long25 = bitInputStream2.readBits((int) (byte) 0);
        long long27 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long29 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
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
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
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
            long long22 = bitInputStream2.readBits((int) 'a');
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
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
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
            long long28 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
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
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass21 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
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
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
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
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
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
            long long24 = bitInputStream2.readBits(10);
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
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
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
        long long16 = bitInputStream2.readBits((int) (short) 0);
        java.lang.Class<?> wildcardClass17 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
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
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) '#');
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
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
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
            long long26 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
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
        long long17 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
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
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
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
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits(10);
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
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass14 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
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
        java.lang.Class<?> wildcardClass24 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
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
        long long17 = bitInputStream2.readBits((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
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
        java.lang.Class<?> wildcardClass28 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
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
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
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
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits(10);
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
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
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
            long long21 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
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
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) (byte) 1);
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
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
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
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
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
        long long16 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long21 = bitInputStream2.readBits(0);
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }
}

