package org.apache.commons.compress.utils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

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
    public void test6501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6501");
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
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6502");
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test6503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6503");
        java.io.InputStream inputStream0 = null;
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6504");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass12 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6505");
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
        long long17 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass19 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6506");
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
        // The following exception was thrown during execution in test generation
        try {
            long long32 = bitInputStream2.readBits((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test6507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6507");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6508");
        java.io.InputStream inputStream0 = null;
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
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6509");
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
        long long24 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6510");
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
        long long14 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test6511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6511");
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
            long long31 = bitInputStream2.readBits((int) ' ');
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
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test6512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6512");
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6513");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test6514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6514");
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
            long long20 = bitInputStream2.readBits(1);
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
    public void test6515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6515");
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
    }

    @Test
    public void test6516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6516");
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
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits(0);
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6517");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test6518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6518");
        java.io.InputStream inputStream0 = null;
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
    public void test6519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6519");
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
    public void test6520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6520");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        long long27 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long29 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test6521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6521");
        java.io.InputStream inputStream0 = null;
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6522");
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test6523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6523");
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test6524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6524");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test6525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6525");
        java.io.InputStream inputStream0 = null;
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
            long long22 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6526");
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
            long long14 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test6527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6527");
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
            long long26 = bitInputStream2.readBits((int) ' ');
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
    public void test6528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6528");
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
        long long21 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long24 = bitInputStream2.readBits((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6529");
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
        java.lang.Class<?> wildcardClass18 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6530");
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
        long long26 = bitInputStream2.readBits((int) (short) 0);
        java.lang.Class<?> wildcardClass27 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6531");
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6532");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
    public void test6533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6533");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test6534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6534");
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
        long long14 = bitInputStream2.readBits(0);
        long long16 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test6535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6535");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test6536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6536");
        java.io.InputStream inputStream0 = null;
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass26 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6537");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test6538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6538");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test6539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6539");
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test6540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6540");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long14 = bitInputStream2.readBits((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test6541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6541");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test6542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6542");
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
        long long25 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass26 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6543");
        java.io.InputStream inputStream0 = null;
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
        long long18 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6544");
        java.io.InputStream inputStream0 = null;
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
            long long16 = bitInputStream2.readBits((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test6545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6545");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test6546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6546");
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits((int) (byte) 10);
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
    public void test6547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6547");
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6548");
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
            long long14 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test6549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6549");
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
            long long15 = bitInputStream2.readBits((-1));
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
    public void test6550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6550");
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
        java.lang.Class<?> wildcardClass16 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6551");
        java.io.InputStream inputStream0 = null;
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6552");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
    public void test6553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6553");
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
            long long21 = bitInputStream2.readBits((int) (short) -1);
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
    public void test6554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6554");
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits(1);
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
    public void test6555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6555");
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
        long long16 = bitInputStream2.readBits((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test6556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6556");
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass16 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6557");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long33 = bitInputStream2.readBits((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test6558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6558");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass30 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test6559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6559");
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
        long long14 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test6560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6560");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass30 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test6561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6561");
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
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) (short) 10);
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
    public void test6562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6562");
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
        bitInputStream2.clearBitCache();
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6563");
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
        long long23 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test6564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6564");
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6565");
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
            long long15 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test6566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6566");
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
        bitInputStream2.clearBitCache();
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test6567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6567");
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
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test6568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6568");
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
            long long28 = bitInputStream2.readBits((int) (short) 10);
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
    public void test6569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6569");
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
        long long20 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6570");
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
        long long22 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass24 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6571");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass26 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6572");
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6573");
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6574");
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
    public void test6575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6575");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6576");
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
        // The following exception was thrown during execution in test generation
        try {
            long long31 = bitInputStream2.readBits((-1));
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test6577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6577");
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
            long long19 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test6578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6578");
        java.io.InputStream inputStream0 = null;
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test6579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6579");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test6580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6580");
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
        long long33 = bitInputStream2.readBits((int) (byte) 0);
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
    public void test6581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6581");
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
    }

    @Test
    public void test6582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6582");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        long long22 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6583");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test6584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6584");
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
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test6585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6585");
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
            long long19 = bitInputStream2.readBits((int) ' ');
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
    public void test6586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6586");
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
            long long21 = bitInputStream2.readBits((int) (short) -1);
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
    public void test6587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6587");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6588");
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
        long long19 = bitInputStream2.readBits((int) (short) 0);
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6589");
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
        long long23 = bitInputStream2.readBits(0);
        long long25 = bitInputStream2.readBits((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test6590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6590");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bitInputStream2.readBits((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test6591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6591");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6592");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass30 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test6593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6593");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
    public void test6594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6594");
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
    public void test6595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6595");
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
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6596");
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
    public void test6597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6597");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits((int) (byte) 10);
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
    public void test6598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6598");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits(10);
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
    public void test6599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6599");
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6600");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        long long18 = bitInputStream2.readBits((int) (byte) 0);
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
    public void test6601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6601");
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass24 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6602");
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
        long long20 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6603");
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
        long long28 = bitInputStream2.readBits((int) (byte) 0);
        long long30 = bitInputStream2.readBits((int) (short) 0);
        long long32 = bitInputStream2.readBits(0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test6604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6604");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        long long19 = bitInputStream2.readBits(0);
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
    public void test6605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6605");
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
        long long19 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6606");
        java.io.InputStream inputStream0 = null;
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
    public void test6607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6607");
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
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits((int) (short) 10);
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
    public void test6608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6608");
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
    }

    @Test
    public void test6609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6609");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test6610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6610");
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
        long long29 = bitInputStream2.readBits((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test6611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6611");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test6612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6612");
        java.io.InputStream inputStream0 = null;
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6613");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        long long16 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test6614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6614");
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
        // The following exception was thrown during execution in test generation
        try {
            long long28 = bitInputStream2.readBits((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test6615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6615");
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
        java.lang.Class<?> wildcardClass14 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6616");
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
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) (short) 100);
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
    public void test6617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6617");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long29 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6618");
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long31 = bitInputStream2.readBits(100);
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6619");
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
        long long25 = bitInputStream2.readBits((int) (short) 0);
        java.lang.Class<?> wildcardClass26 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6620");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long23 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6621");
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
        // The following exception was thrown during execution in test generation
        try {
            long long29 = bitInputStream2.readBits((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test6622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6622");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        long long28 = bitInputStream2.readBits(0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test6623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6623");
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
        // The following exception was thrown during execution in test generation
        try {
            long long12 = bitInputStream2.readBits((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test6624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6624");
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
        long long20 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6625");
        java.io.InputStream inputStream0 = null;
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6626");
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
            long long15 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test6627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6627");
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
        java.lang.Class<?> wildcardClass26 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6628");
        java.io.InputStream inputStream0 = null;
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test6629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6629");
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
        long long17 = bitInputStream2.readBits((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6630");
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6631");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test6632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6632");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long31 = bitInputStream2.readBits(100);
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
    }

    @Test
    public void test6633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6633");
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
        long long13 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass15 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6634");
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass27 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6635");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6636");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test6637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6637");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test6638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6638");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long22 = bitInputStream2.readBits((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6639");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test6640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6640");
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
            long long27 = bitInputStream2.readBits((int) (short) -1);
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
    public void test6641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6641");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6642");
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
        long long19 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6643");
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
        long long19 = bitInputStream2.readBits((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6644");
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
        // The following exception was thrown during execution in test generation
        try {
            long long29 = bitInputStream2.readBits(1);
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
    public void test6645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6645");
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
        long long18 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6646");
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
        long long17 = bitInputStream2.readBits(0);
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6647");
        java.io.InputStream inputStream0 = null;
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long28 = bitInputStream2.readBits((int) '4');
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
    public void test6648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6648");
        java.io.InputStream inputStream0 = null;
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits((-1));
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
    public void test6649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6649");
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6650");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        long long26 = bitInputStream2.readBits(0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test6651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6651");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        java.lang.Class<?> wildcardClass24 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6652");
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
        bitInputStream2.clearBitCache();
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
    public void test6653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6653");
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
            long long20 = bitInputStream2.readBits((-1));
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
    public void test6654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6654");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass13 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6655");
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
            long long19 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6656");
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
        long long25 = bitInputStream2.readBits(0);
        long long27 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long29 = bitInputStream2.readBits((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test6657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6657");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long23 = bitInputStream2.readBits((int) 'a');
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
    public void test6658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6658");
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
        long long25 = bitInputStream2.readBits((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test6659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6659");
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
        long long14 = bitInputStream2.readBits((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test6660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6660");
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
        long long17 = bitInputStream2.readBits((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6661");
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
            long long25 = bitInputStream2.readBits(10);
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
    public void test6662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6662");
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6663");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long26 = bitInputStream2.readBits((int) '#');
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
    public void test6664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6664");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6665");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long9 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = bitInputStream2.readBits((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test6666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6666");
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
        long long29 = bitInputStream2.readBits((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test6667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6667");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        long long21 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test6668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6668");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test6669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6669");
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6670");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test6671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6671");
        java.io.InputStream inputStream0 = null;
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
            long long24 = bitInputStream2.readBits(10);
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
    public void test6672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6672");
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
    public void test6673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6673");
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
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test6674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6674");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test6675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6675");
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
    }

    @Test
    public void test6676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6676");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test6677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6677");
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
            long long23 = bitInputStream2.readBits((int) (byte) 10);
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
    public void test6678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6678");
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
        // The following exception was thrown during execution in test generation
        try {
            long long28 = bitInputStream2.readBits((int) 'a');
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
    public void test6679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6679");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test6680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6680");
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
        long long22 = bitInputStream2.readBits((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6681");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6682");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
    public void test6683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6683");
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
            long long17 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test6684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6684");
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
        long long15 = bitInputStream2.readBits((int) (byte) 0);
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
    public void test6685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6685");
        java.io.InputStream inputStream0 = null;
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
    public void test6686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6686");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long9 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test6687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6687");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long31 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6688");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test6689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6689");
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test6690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6690");
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test6691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6691");
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6692");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        long long21 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits((int) '#');
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
    public void test6693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6693");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6694");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            bitInputStream2.close();
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
    public void test6695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6695");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
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
    public void test6696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6696");
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
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6697");
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
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6698");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test6699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6699");
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
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits((int) (byte) -1);
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
    public void test6700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6700");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long27 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test6701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6701");
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
        long long19 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long23 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test6702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6702");
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
            long long19 = bitInputStream2.readBits((int) '4');
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
    public void test6703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6703");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long26 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test6704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6704");
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
        long long15 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test6705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6705");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        long long21 = bitInputStream2.readBits((int) (short) 0);
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6706");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long34 = bitInputStream2.readBits((int) (byte) 10);
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
    public void test6707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6707");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        long long27 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test6708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6708");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass26 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6709");
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
        long long25 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test6710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6710");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits((int) (short) 0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test6711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6711");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test6712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6712");
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
        long long14 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test6713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6713");
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
        java.lang.Class<?> wildcardClass12 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6714");
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
        long long17 = bitInputStream2.readBits((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6715");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        long long21 = bitInputStream2.readBits((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test6716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6716");
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
        java.lang.Class<?> wildcardClass12 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6717");
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test6718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6718");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        long long27 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long29 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test6719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6719");
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
            long long17 = bitInputStream2.readBits((int) (byte) 1);
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
    public void test6720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6720");
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
            long long22 = bitInputStream2.readBits(1);
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
    public void test6721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6721");
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test6722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6722");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long21 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test6723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6723");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long33 = bitInputStream2.readBits((int) (byte) 10);
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
    public void test6724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6724");
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
        long long17 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6725");
        java.io.InputStream inputStream0 = null;
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test6726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6726");
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test6727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6727");
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6728");
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test6729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6729");
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
        long long27 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long29 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test6730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6730");
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
            long long19 = bitInputStream2.readBits((int) (short) 1);
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
    public void test6731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6731");
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
        long long21 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long25 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits((int) ' ');
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test6732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6732");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test6733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6733");
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6734");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
    public void test6735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6735");
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
            long long17 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test6736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6736");
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
            long long19 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6737");
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
    public void test6738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6738");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6739");
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
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6740");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
    public void test6741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6741");
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
        long long27 = bitInputStream2.readBits((int) (short) 0);
        java.lang.Class<?> wildcardClass28 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6742");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
    public void test6743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6743");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (byte) 0);
        java.lang.Class<?> wildcardClass6 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6744");
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
            long long15 = bitInputStream2.readBits((int) (byte) -1);
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
    public void test6745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6745");
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
            long long35 = bitInputStream2.readBits((int) 'a');
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
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test6746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6746");
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6747");
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
    public void test6748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6748");
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
    }

    @Test
    public void test6749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6749");
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
            long long15 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test6750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6750");
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
        // The following exception was thrown during execution in test generation
        try {
            long long15 = bitInputStream2.readBits((int) ' ');
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
    public void test6751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6751");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6752");
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
        long long26 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass27 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6753");
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
        java.lang.Class<?> wildcardClass17 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6754");
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
    public void test6755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6755");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long28 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6756");
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
        long long20 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass21 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6757");
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
            long long23 = bitInputStream2.readBits(10);
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
    public void test6758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6758");
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
        long long21 = bitInputStream2.readBits((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test6759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6759");
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
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test6760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6760");
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
    }

    @Test
    public void test6761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6761");
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
        long long17 = bitInputStream2.readBits(0);
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6762");
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
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test6763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6763");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        bitInputStream2.clearBitCache();
        long long26 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test6764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6764");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        java.lang.Class<?> wildcardClass28 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6765");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test6766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6766");
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
        long long21 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test6767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6767");
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
        java.lang.Class<?> wildcardClass19 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6768");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test6769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6769");
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6770");
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test6771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6771");
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
        java.lang.Class<?> wildcardClass19 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6772");
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6773");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test6774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6774");
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test6775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6775");
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
        long long17 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6776");
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
        long long31 = bitInputStream2.readBits((int) (byte) 0);
        java.lang.Class<?> wildcardClass32 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test6777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6777");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long23 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test6778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6778");
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
        long long27 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
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
    public void test6779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6779");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test6780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6780");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long9 = bitInputStream2.readBits((int) (short) 0);
        long long11 = bitInputStream2.readBits(0);
        long long13 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass14 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6781");
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
            long long11 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test6782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6782");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test6783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6783");
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
        long long22 = bitInputStream2.readBits((int) (short) 0);
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6784");
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
        java.lang.Class<?> wildcardClass30 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test6785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6785");
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
        long long30 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long32 = bitInputStream2.readBits((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test6786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6786");
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
            long long15 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test6787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6787");
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test6788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6788");
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
            long long27 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6789");
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
            long long32 = bitInputStream2.readBits((int) 'a');
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
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test6790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6790");
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
    public void test6791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6791");
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
        long long23 = bitInputStream2.readBits((int) (short) 0);
        long long25 = bitInputStream2.readBits((int) (short) 0);
        java.lang.Class<?> wildcardClass26 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6792");
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
        long long26 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long28 = bitInputStream2.readBits(100);
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test6793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6793");
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
    public void test6794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6794");
        java.io.InputStream inputStream0 = null;
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
        long long26 = bitInputStream2.readBits((int) (short) 0);
        long long28 = bitInputStream2.readBits((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test6795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6795");
        java.io.InputStream inputStream0 = null;
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6796");
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
        long long22 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass24 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6797");
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test6798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6798");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        long long31 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass34 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test6799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6799");
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
        long long28 = bitInputStream2.readBits((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test6800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6800");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test6801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6801");
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
            long long25 = bitInputStream2.readBits((int) (short) 1);
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
    public void test6802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6802");
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6803");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) (byte) 10);
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
    public void test6804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6804");
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
        long long28 = bitInputStream2.readBits((int) (byte) 0);
        long long30 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long33 = bitInputStream2.readBits((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test6805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6805");
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6806");
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
    public void test6807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6807");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long30 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test6808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6808");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass13 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6809");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
    public void test6810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6810");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass19 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6811");
        java.io.InputStream inputStream0 = null;
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6812");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test6813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6813");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6814");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test6815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6815");
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test6816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6816");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        long long10 = bitInputStream2.readBits(0);
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
    public void test6817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6817");
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6818");
        java.io.InputStream inputStream0 = null;
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6819");
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
        long long24 = bitInputStream2.readBits(0);
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6820");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
    }

    @Test
    public void test6821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6821");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass24 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6822");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits(10);
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
    public void test6823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6823");
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
            long long21 = bitInputStream2.readBits((int) (byte) -1);
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
    public void test6824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6824");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test6825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6825");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6826");
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
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits((int) (short) 10);
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
    public void test6827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6827");
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
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test6828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6828");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test6829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6829");
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
        bitInputStream2.clearBitCache();
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
    public void test6830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6830");
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
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits((-1));
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
    public void test6831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6831");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long30 = bitInputStream2.readBits(100);
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
    public void test6832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6832");
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test6833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6833");
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
        long long27 = bitInputStream2.readBits((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test6834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6834");
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass24 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6835");
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
            long long27 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6836");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass26 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6837");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6838");
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
        long long20 = bitInputStream2.readBits(0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6839");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass28 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6840");
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
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) '4');
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
    public void test6841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6841");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass29 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6842");
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
        long long17 = bitInputStream2.readBits((int) (byte) 0);
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
    public void test6843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6843");
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
        java.lang.Class<?> wildcardClass17 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6844");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test6845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6845");
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
        long long25 = bitInputStream2.readBits((int) (byte) 0);
        long long27 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass28 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6846");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test6847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6847");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test6848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6848");
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6849");
        java.io.InputStream inputStream0 = null;
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
            long long20 = bitInputStream2.readBits((int) '#');
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
    public void test6850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6850");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test6851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6851");
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
            long long22 = bitInputStream2.readBits((int) (short) 100);
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
    public void test6852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6852");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test6853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6853");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        java.lang.Class<?> wildcardClass31 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6854");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test6855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6855");
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6856");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass18 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6857");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6858");
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
        java.lang.Class<?> wildcardClass18 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6859");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test6860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6860");
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6861");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long29 = bitInputStream2.readBits((int) (short) -1);
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
    public void test6862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6862");
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
        // The following exception was thrown during execution in test generation
        try {
            long long15 = bitInputStream2.readBits((int) 'a');
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
    public void test6863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6863");
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
        long long20 = bitInputStream2.readBits((int) (byte) 0);
        long long22 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6864");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long17 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test6865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6865");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
    public void test6866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6866");
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
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) (byte) 10);
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
    public void test6867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6867");
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
        long long19 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6868");
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
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test6869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6869");
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6870");
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
    public void test6871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6871");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6872");
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
        long long24 = bitInputStream2.readBits(0);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6873");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = bitInputStream2.readBits((int) (short) -1);
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
    public void test6874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6874");
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
        long long33 = bitInputStream2.readBits(0);
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
    public void test6875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6875");
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
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits((int) 'a');
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
    public void test6876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6876");
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
        java.lang.Class<?> wildcardClass27 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6877");
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
    public void test6878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6878");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        long long26 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass27 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6879");
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass24 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6880");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass26 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6881");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long30 = bitInputStream2.readBits((int) ' ');
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
    public void test6882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6882");
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test6883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6883");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test6884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6884");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test6885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6885");
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
    public void test6886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6886");
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
        long long21 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test6887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6887");
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
        long long25 = bitInputStream2.readBits(0);
        long long27 = bitInputStream2.readBits(0);
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test6888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6888");
        java.io.InputStream inputStream0 = null;
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
    }

    @Test
    public void test6889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6889");
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
            long long21 = bitInputStream2.readBits((int) (short) 100);
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
    public void test6890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6890");
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
        long long22 = bitInputStream2.readBits(0);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6891");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        bitInputStream2.clearBitCache();
        long long27 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test6892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6892");
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
    public void test6893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6893");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6894");
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
        bitInputStream2.clearBitCache();
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6895");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test6896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6896");
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
            long long21 = bitInputStream2.readBits((int) (byte) -1);
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
    public void test6897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6897");
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
    public void test6898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6898");
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6899");
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
        long long24 = bitInputStream2.readBits((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6900");
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
            long long27 = bitInputStream2.readBits((int) '#');
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
    public void test6901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6901");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test6902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6902");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass27 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6903");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long29 = bitInputStream2.readBits((int) (short) 1);
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
    public void test6904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6904");
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
        long long27 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test6905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6905");
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
            long long17 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test6906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6906");
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6907");
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
        long long14 = bitInputStream2.readBits((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test6908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6908");
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
        java.lang.Class<?> wildcardClass19 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6909");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        long long25 = bitInputStream2.readBits((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test6910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6910");
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
        java.lang.Class<?> wildcardClass28 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6911");
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
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test6912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6912");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits(0);
        long long13 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test6913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6913");
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
        long long15 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test6914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6914");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        long long26 = bitInputStream2.readBits((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test6915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6915");
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
            long long20 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6916");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits((int) (byte) 0);
        long long9 = bitInputStream2.readBits((int) (short) 0);
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
    public void test6917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6917");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            bitInputStream2.close();
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
    public void test6918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6918");
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
        long long25 = bitInputStream2.readBits((int) (byte) 0);
        long long27 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test6919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6919");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test6920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6920");
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6921");
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
        // The following exception was thrown during execution in test generation
        try {
            long long13 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test6922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6922");
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
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test6923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6923");
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
        java.lang.Class<?> wildcardClass21 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6924");
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass17 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6925");
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
        long long22 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long25 = bitInputStream2.readBits((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test6926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6926");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        java.lang.Class<?> wildcardClass17 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6927");
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
            long long18 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test6928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6928");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        java.lang.Class<?> wildcardClass21 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6929");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        long long24 = bitInputStream2.readBits((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6930");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6931");
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test6932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6932");
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
            long long23 = bitInputStream2.readBits(100);
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
    public void test6933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6933");
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
            long long28 = bitInputStream2.readBits((int) (short) -1);
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
    public void test6934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6934");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass30 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test6935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6935");
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
        java.lang.Class<?> wildcardClass27 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6936");
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
            long long19 = bitInputStream2.readBits((int) '#');
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
    public void test6937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6937");
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
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test6938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6938");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        long long16 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test6939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6939");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass29 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6940");
        java.io.InputStream inputStream0 = null;
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
            long long14 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test6941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6941");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6942");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test6943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6943");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long29 = bitInputStream2.readBits((int) '#');
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
    public void test6944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6944");
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
            long long16 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test6945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6945");
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
        bitInputStream2.clearBitCache();
        long long29 = bitInputStream2.readBits((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test6946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6946");
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
            long long18 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test6947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6947");
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
        bitInputStream2.clearBitCache();
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6948");
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass19 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6949");
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6950");
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test6951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6951");
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6952");
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
        long long25 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass27 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6953");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        long long24 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6954");
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
        long long27 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test6955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6955");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test6956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6956");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long9 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test6957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6957");
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
            long long24 = bitInputStream2.readBits((-1));
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
    public void test6958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6958");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits((int) ' ');
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
    public void test6959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6959");
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test6960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6960");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long7 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long13 = bitInputStream2.readBits(0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test6961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6961");
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
        long long24 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits(1);
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6962");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        long long25 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long28 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test6963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6963");
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
    public void test6964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6964");
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
            long long27 = bitInputStream2.readBits((int) (short) 1);
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
    public void test6965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6965");
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
    }

    @Test
    public void test6966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6966");
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
            long long22 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6967");
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
        long long25 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass26 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6968");
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
            long long20 = bitInputStream2.readBits((int) (byte) 10);
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
    public void test6969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6969");
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6970");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long26 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6971");
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
        long long16 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass17 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6972");
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
            long long16 = bitInputStream2.readBits((-1));
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
    public void test6973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6973");
        java.io.InputStream inputStream0 = null;
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass29 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6974");
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
        long long20 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6975");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6976");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test6977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6977");
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test6978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6978");
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6979");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6980");
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long28 = bitInputStream2.readBits((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test6981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6981");
        java.io.InputStream inputStream0 = null;
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
        long long21 = bitInputStream2.readBits(0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test6982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6982");
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits((int) ' ');
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
    public void test6983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6983");
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
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test6984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6984");
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6985");
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
        long long25 = bitInputStream2.readBits((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test6986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6986");
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
        bitInputStream2.clearBitCache();
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
    public void test6987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6987");
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
        long long30 = bitInputStream2.readBits(0);
        long long32 = bitInputStream2.readBits(0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test6988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6988");
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
    public void test6989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6989");
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
            long long23 = bitInputStream2.readBits(10);
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
    public void test6990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6990");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long17 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test6991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6991");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long9 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test6992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6992");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6993");
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
    public void test6994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6994");
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
        long long15 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test6995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6995");
        java.io.InputStream inputStream0 = null;
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
        bitInputStream2.clearBitCache();
        long long19 = bitInputStream2.readBits(0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6996");
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
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits((-1));
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
    public void test6997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6997");
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
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits((-1));
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
    }

    @Test
    public void test6998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6998");
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
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6999");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long24 = bitInputStream2.readBits((int) (byte) 1);
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
    public void test7000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test7000");
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
            long long20 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }
}

