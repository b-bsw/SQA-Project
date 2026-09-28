package org.apache.commons.compress.utils;

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
            long long21 = bitInputStream2.readBits((int) (short) 1);
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
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
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
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
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
        java.lang.Class<?> wildcardClass17 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
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
        // The following exception was thrown during execution in test generation
        try {
            long long15 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        java.io.InputStream inputStream0 = null;
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
            long long24 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
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
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        java.io.InputStream inputStream0 = null;
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
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
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
        java.lang.Class<?> wildcardClass16 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
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
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        java.io.InputStream inputStream0 = null;
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
            long long24 = bitInputStream2.readBits((-1));
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
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
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
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((int) (byte) 1);
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
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
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
            long long11 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits(0);
        long long9 = bitInputStream2.readBits((int) (byte) 0);
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
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
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
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass16 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
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
        // The following exception was thrown during execution in test generation
        try {
            long long15 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
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
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
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
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        java.io.InputStream inputStream0 = null;
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
            long long21 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
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
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits((int) (byte) 1);
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
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
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
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits(10);
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
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
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
        java.lang.Class<?> wildcardClass27 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
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
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
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
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long7 = bitInputStream2.readBits(0);
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
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
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
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        java.io.InputStream inputStream0 = null;
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
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        java.io.InputStream inputStream0 = null;
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
        long long23 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        java.io.InputStream inputStream0 = null;
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
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass14 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
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
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
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
        java.lang.Class<?> wildcardClass14 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
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
        java.lang.Class<?> wildcardClass16 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
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
        java.lang.Class<?> wildcardClass14 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
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
        long long15 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass24 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
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
            long long27 = bitInputStream2.readBits((int) (byte) 10);
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
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
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
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) '4');
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
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits((int) 'a');
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
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) 'a');
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
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
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
        java.lang.Class<?> wildcardClass17 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits((int) ' ');
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
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
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
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
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
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
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
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
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
            long long23 = bitInputStream2.readBits((int) '#');
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
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
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
            bitInputStream2.close();
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
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
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
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
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
            long long15 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        java.io.InputStream inputStream0 = null;
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
            long long26 = bitInputStream2.readBits(10);
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
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits(0);
        long long9 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
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
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
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
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
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
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
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
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
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
            bitInputStream2.close();
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
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        java.io.InputStream inputStream0 = null;
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
            long long24 = bitInputStream2.readBits((int) (short) 10);
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
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        java.io.InputStream inputStream0 = null;
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
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        java.io.InputStream inputStream0 = null;
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
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
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
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
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
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
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((int) '#');
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
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        java.io.InputStream inputStream0 = null;
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
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        java.io.InputStream inputStream0 = null;
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
        long long23 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
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
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        java.io.InputStream inputStream0 = null;
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
            long long16 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
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
        long long18 = bitInputStream2.readBits((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
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
        java.lang.Class<?> wildcardClass19 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
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
        java.lang.Class<?> wildcardClass13 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
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
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
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
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits((int) (short) -1);
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
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
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
        java.lang.Class<?> wildcardClass14 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
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
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
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
            long long19 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        java.io.InputStream inputStream0 = null;
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
            long long24 = bitInputStream2.readBits((int) '4');
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
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) '4');
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
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        java.io.InputStream inputStream0 = null;
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
            long long25 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
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
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
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
        java.lang.Class<?> wildcardClass19 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        java.io.InputStream inputStream0 = null;
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
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
        java.lang.Class<?> wildcardClass24 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
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
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
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
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass13 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
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
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
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
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long30 = bitInputStream2.readBits((int) (short) 10);
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
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits((int) (short) 10);
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
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        java.io.InputStream inputStream0 = null;
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
            long long22 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
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
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
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
        long long20 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        java.io.InputStream inputStream0 = null;
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
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass14 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        java.io.InputStream inputStream0 = null;
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
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
        java.lang.Class<?> wildcardClass21 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        java.io.InputStream inputStream0 = null;
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
            bitInputStream2.close();
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
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass11 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        java.io.InputStream inputStream0 = null;
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
        long long14 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
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
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
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
            long long30 = bitInputStream2.readBits(100);
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
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        java.io.InputStream inputStream0 = null;
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
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
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
            long long15 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
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
        java.lang.Class<?> wildcardClass18 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
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
            long long18 = bitInputStream2.readBits(1);
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
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        java.io.InputStream inputStream0 = null;
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
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits(1);
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
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        java.io.InputStream inputStream0 = null;
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
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
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
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
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
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits((int) ' ');
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
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass16 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits(0);
        long long9 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass26 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
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
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        java.io.InputStream inputStream0 = null;
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
        long long14 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
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
        java.lang.Class<?> wildcardClass24 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long9 = bitInputStream2.readBits((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) (short) 1);
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
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
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
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
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
        java.lang.Class<?> wildcardClass17 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass30 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits(10);
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
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
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
            long long14 = bitInputStream2.readBits((int) (byte) 1);
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
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
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
        java.lang.Class<?> wildcardClass18 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
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
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
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
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        java.io.InputStream inputStream0 = null;
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
            long long23 = bitInputStream2.readBits((int) ' ');
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
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
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
            long long12 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        java.io.InputStream inputStream0 = null;
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
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
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
        java.lang.Class<?> wildcardClass16 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
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
            long long21 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
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
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
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
        java.lang.Class<?> wildcardClass24 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
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
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
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
        java.lang.Class<?> wildcardClass19 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
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
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) (short) 1);
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
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        java.io.InputStream inputStream0 = null;
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
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
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
            long long20 = bitInputStream2.readBits((int) 'a');
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
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        java.io.InputStream inputStream0 = null;
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass27 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
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
            long long23 = bitInputStream2.readBits((int) (short) 100);
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
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
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
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((int) (byte) 100);
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
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
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
            long long19 = bitInputStream2.readBits(100);
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
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
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
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        java.io.InputStream inputStream0 = null;
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
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
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
            long long11 = bitInputStream2.readBits((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
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
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits(10);
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
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
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
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
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
        // The following exception was thrown during execution in test generation
        try {
            long long28 = bitInputStream2.readBits((int) '#');
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits(0);
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
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
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
        java.lang.Class<?> wildcardClass21 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits((int) (byte) 0);
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
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        java.io.InputStream inputStream0 = null;
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
        long long25 = bitInputStream2.readBits(0);
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
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
        long long15 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass16 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
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
            long long16 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) (short) 10);
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
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        java.io.InputStream inputStream0 = null;
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
            long long24 = bitInputStream2.readBits((int) (short) 10);
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
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
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
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass16 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
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
            long long12 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass9 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
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
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
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
            long long26 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits((int) (short) -1);
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
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        java.io.InputStream inputStream0 = null;
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
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
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
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
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
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
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
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits(10);
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
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
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
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) (byte) 100);
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
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
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
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        java.io.InputStream inputStream0 = null;
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
        long long25 = bitInputStream2.readBits(0);
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
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
        java.lang.Class<?> wildcardClass18 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        java.io.InputStream inputStream0 = null;
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
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
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
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((-1));
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
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
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
        java.lang.Class<?> wildcardClass17 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        java.io.InputStream inputStream0 = null;
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
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
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
        long long12 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
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
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
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
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
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
        java.lang.Class<?> wildcardClass15 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
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
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
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
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
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
            long long19 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass18 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
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
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits((int) (byte) -1);
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
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
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
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) (byte) 100);
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
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
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
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
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
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
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
            bitInputStream2.close();
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
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        java.io.InputStream inputStream0 = null;
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long28 = bitInputStream2.readBits((int) (short) 100);
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
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        java.io.InputStream inputStream0 = null;
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) (byte) 1);
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
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
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
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
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
        long long24 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits((int) '4');
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
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
            long long14 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        java.io.InputStream inputStream0 = null;
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
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
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
            long long20 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
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
        // The following exception was thrown during execution in test generation
        try {
            long long14 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
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
        long long12 = bitInputStream2.readBits((int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
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
        // The following exception was thrown during execution in test generation
        try {
            long long14 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
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
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
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
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
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
            long long15 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        java.io.InputStream inputStream0 = null;
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits(10);
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
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
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
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
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
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits(100);
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
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
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
        java.lang.Class<?> wildcardClass17 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits(100);
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
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
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
        java.lang.Class<?> wildcardClass13 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass12 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        java.io.InputStream inputStream0 = null;
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
            long long22 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass21 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
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
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
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
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits(10);
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
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
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
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
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
            long long28 = bitInputStream2.readBits((int) (byte) 100);
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
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) '4');
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
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
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
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass24 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
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
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits((int) (byte) 100);
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
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
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
            long long18 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
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
        java.lang.Class<?> wildcardClass26 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
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
        long long15 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long7 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
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
        long long20 = bitInputStream2.readBits(0);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
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
            long long23 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits(0);
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
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
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
        // The following exception was thrown during execution in test generation
        try {
            long long28 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass26 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        java.io.InputStream inputStream0 = null;
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
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
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
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits((-1));
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
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
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
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits((int) ' ');
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
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
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
        java.lang.Class<?> wildcardClass18 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass17 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
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
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        java.io.InputStream inputStream0 = null;
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
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
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
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
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
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long14 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
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
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) (byte) 10);
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
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
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
        long long17 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass21 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass18 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
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
            long long24 = bitInputStream2.readBits(10);
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
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
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
            long long19 = bitInputStream2.readBits(10);
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
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
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
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        java.io.InputStream inputStream0 = null;
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
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass18 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) ' ');
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
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
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
            long long18 = bitInputStream2.readBits((-1));
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
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        java.io.InputStream inputStream0 = null;
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
            long long22 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
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
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
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
        java.lang.Class<?> wildcardClass16 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
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
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits(1);
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
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
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
        java.lang.Class<?> wildcardClass19 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
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
        long long15 = bitInputStream2.readBits((int) (short) 0);
        java.lang.Class<?> wildcardClass16 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass29 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        java.io.InputStream inputStream0 = null;
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
            long long25 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
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
            long long17 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits((int) (byte) 0);
        long long12 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = bitInputStream2.readBits((int) (byte) 100);
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
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) '4');
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
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
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
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
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
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits(10);
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
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
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
        java.lang.Class<?> wildcardClass21 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
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
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
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
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
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
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
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
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
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
        long long15 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        java.io.InputStream inputStream0 = null;
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
        long long17 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
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
            long long18 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long12 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass14 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
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
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
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
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
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
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits((int) (short) -1);
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
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass16 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) (byte) 1);
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
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
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
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits((int) (byte) 1);
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
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
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
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass19 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
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
        long long13 = bitInputStream2.readBits((int) (short) 0);
        java.lang.Class<?> wildcardClass14 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
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
            long long21 = bitInputStream2.readBits((int) '4');
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
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        java.io.InputStream inputStream0 = null;
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits((int) '4');
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
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
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
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        java.io.InputStream inputStream0 = null;
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
        long long24 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits((int) '#');
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
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
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long7 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass11 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        java.io.InputStream inputStream0 = null;
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
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
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
            long long26 = bitInputStream2.readBits((int) 'a');
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
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
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
        long long12 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        java.io.InputStream inputStream0 = null;
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
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
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
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
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
        java.lang.Class<?> wildcardClass16 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
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
        long long21 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        java.io.InputStream inputStream0 = null;
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        java.io.InputStream inputStream0 = null;
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass24 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        java.io.InputStream inputStream0 = null;
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
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        java.io.InputStream inputStream0 = null;
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
            long long18 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
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
            long long28 = bitInputStream2.readBits(100);
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
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
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
        // The following exception was thrown during execution in test generation
        try {
            long long28 = bitInputStream2.readBits((int) (short) 10);
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
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bitInputStream2.readBits((int) ' ');
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
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        java.io.InputStream inputStream0 = null;
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
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
            long long15 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
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
        // The following exception was thrown during execution in test generation
        try {
            long long33 = bitInputStream2.readBits((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
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
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        java.io.InputStream inputStream0 = null;
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
            long long22 = bitInputStream2.readBits((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
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
        // The following exception was thrown during execution in test generation
        try {
            long long28 = bitInputStream2.readBits((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
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
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
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
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
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
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((int) (short) 100);
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
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        java.io.InputStream inputStream0 = null;
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
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
        java.lang.Class<?> wildcardClass21 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
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
        java.lang.Class<?> wildcardClass29 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
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
            long long15 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
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
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        java.io.InputStream inputStream0 = null;
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass29 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
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
        java.lang.Class<?> wildcardClass21 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) ' ');
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
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
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
        java.lang.Class<?> wildcardClass17 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
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
        java.lang.Class<?> wildcardClass16 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
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
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((int) (byte) 10);
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
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = bitInputStream2.readBits((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
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
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
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
            long long15 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
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
            long long23 = bitInputStream2.readBits(10);
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
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
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
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
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
        java.lang.Class<?> wildcardClass18 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
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
        java.lang.Class<?> wildcardClass29 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long9 = bitInputStream2.readBits(0);
        long long11 = bitInputStream2.readBits(0);
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
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass33 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
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
            long long19 = bitInputStream2.readBits((int) (short) 1);
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
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
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
        long long23 = bitInputStream2.readBits(0);
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
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
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
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
        java.lang.Class<?> wildcardClass16 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        java.io.InputStream inputStream0 = null;
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
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
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
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
        long long15 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass16 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
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
        java.lang.Class<?> wildcardClass19 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        java.io.InputStream inputStream0 = null;
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
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
        java.lang.Class<?> wildcardClass18 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
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
        java.lang.Class<?> wildcardClass16 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits((int) (short) 0);
        long long10 = bitInputStream2.readBits(0);
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
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
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
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
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
            long long21 = bitInputStream2.readBits((int) (short) 1);
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
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
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
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        java.io.InputStream inputStream0 = null;
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
        long long27 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long29 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
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
            long long20 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits(10);
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
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
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
        // The following exception was thrown during execution in test generation
        try {
            long long14 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
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
            long long26 = bitInputStream2.readBits((int) (byte) 1);
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
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
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
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long7 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits(0);
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
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
        long long25 = bitInputStream2.readBits(0);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long28 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
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
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
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
            long long15 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
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
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
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
        java.lang.Class<?> wildcardClass19 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        java.io.InputStream inputStream0 = null;
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
        long long14 = bitInputStream2.readBits((int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
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
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
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
        java.lang.Class<?> wildcardClass27 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bitInputStream2.readBits((int) (short) -1);
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
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
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
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((int) '#');
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
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
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
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
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
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
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
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) (byte) 1);
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
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
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
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits((int) 'a');
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
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
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
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        java.io.InputStream inputStream0 = null;
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
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
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
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
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
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) '4');
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
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        java.io.InputStream inputStream0 = null;
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
            long long20 = bitInputStream2.readBits((int) (byte) 1);
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
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
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
            long long23 = bitInputStream2.readBits((int) (short) -1);
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
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass24 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
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
        java.lang.Class<?> wildcardClass19 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        java.io.InputStream inputStream0 = null;
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits(10);
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
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
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
        java.lang.Class<?> wildcardClass26 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
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
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        java.io.InputStream inputStream0 = null;
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
            long long21 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass10 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits(10);
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
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
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
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
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
            long long20 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits((int) (byte) 0);
        long long9 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits((int) (short) -1);
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
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long30 = bitInputStream2.readBits(1);
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
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
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
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }
}

