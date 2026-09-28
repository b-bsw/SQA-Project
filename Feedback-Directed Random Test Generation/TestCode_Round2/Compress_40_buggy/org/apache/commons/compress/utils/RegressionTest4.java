package org.apache.commons.compress.utils;

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
        // The following exception was thrown during execution in test generation
        try {
            long long15 = bitInputStream2.readBits(100);
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
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass27 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
            long long15 = bitInputStream2.readBits((int) (byte) 100);
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
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        java.io.InputStream inputStream0 = null;
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
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
            long long25 = bitInputStream2.readBits(100);
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
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) (short) 10);
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
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
        java.lang.Class<?> wildcardClass12 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
        java.lang.Class<?> wildcardClass18 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass26 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
            long long21 = bitInputStream2.readBits((int) (byte) 1);
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
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        java.io.InputStream inputStream0 = null;
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
            long long21 = bitInputStream2.readBits((int) (byte) 10);
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
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
            long long17 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
        java.lang.Class<?> wildcardClass19 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
            long long20 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        java.lang.Class<?> wildcardClass19 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        java.lang.Class<?> wildcardClass26 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
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
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits(1);
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
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass29 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
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
            long long26 = bitInputStream2.readBits((int) (short) 100);
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
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
        java.lang.Class<?> wildcardClass16 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
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
        java.lang.Class<?> wildcardClass19 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
            long long23 = bitInputStream2.readBits(100);
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
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long23 = bitInputStream2.readBits(100);
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
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long15 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        java.lang.Class<?> wildcardClass15 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
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
        long long15 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass16 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
            long long18 = bitInputStream2.readBits((int) '4');
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
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        java.io.InputStream inputStream0 = null;
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
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long20 = bitInputStream2.readBits((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        java.io.InputStream inputStream0 = null;
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
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
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
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
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
            long long19 = bitInputStream2.readBits((int) ' ');
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
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) (byte) 100);
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
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
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
            long long19 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        java.io.InputStream inputStream0 = null;
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
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits((int) ' ');
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
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long23 = bitInputStream2.readBits(10);
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
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
        // The following exception was thrown during execution in test generation
        try {
            long long15 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        java.io.InputStream inputStream0 = null;
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
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
            long long26 = bitInputStream2.readBits((int) (short) -1);
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
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
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
            long long19 = bitInputStream2.readBits((int) 'a');
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
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long26 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        java.io.InputStream inputStream0 = null;
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
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass24 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) ' ');
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
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
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
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        java.lang.Class<?> wildcardClass18 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
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
            long long20 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long17 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
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
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) (byte) 1);
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
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long26 = bitInputStream2.readBits((int) '4');
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
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        java.io.InputStream inputStream0 = null;
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
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
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
            long long17 = bitInputStream2.readBits((int) (short) 1);
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
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
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
            bitInputStream2.close();
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
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        java.io.InputStream inputStream0 = null;
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        java.io.InputStream inputStream0 = null;
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
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        java.io.InputStream inputStream0 = null;
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
            long long18 = bitInputStream2.readBits((int) '4');
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
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
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
            long long22 = bitInputStream2.readBits((int) (short) 10);
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
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
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
        java.lang.Class<?> wildcardClass21 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
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
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
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
        java.lang.Class<?> wildcardClass12 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
            long long12 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
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
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
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
        java.lang.Class<?> wildcardClass18 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        java.lang.Class<?> wildcardClass24 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
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
            long long24 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        java.lang.Class<?> wildcardClass28 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long14 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits(10);
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
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
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
            long long20 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
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
            long long16 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long24 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
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
            long long21 = bitInputStream2.readBits((int) (short) 100);
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
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
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
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
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
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
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
            long long12 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        java.io.InputStream inputStream0 = null;
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
            long long17 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        java.io.InputStream inputStream0 = null;
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
            long long18 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
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
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long23 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits((int) (byte) 100);
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
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        java.lang.Class<?> wildcardClass15 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
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
        java.lang.Class<?> wildcardClass19 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        java.io.InputStream inputStream0 = null;
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
            long long25 = bitInputStream2.readBits((int) (short) 10);
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
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
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
            long long13 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        java.io.InputStream inputStream0 = null;
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
            long long17 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long17 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
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
        java.lang.Class<?> wildcardClass17 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
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
        java.lang.Class<?> wildcardClass18 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
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
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long17 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
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
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
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
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
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
        long long15 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
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
        java.lang.Class<?> wildcardClass24 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        java.io.InputStream inputStream0 = null;
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
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
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
        java.lang.Class<?> wildcardClass15 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        java.io.InputStream inputStream0 = null;
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
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
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
            long long19 = bitInputStream2.readBits((int) '#');
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
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits(0);
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
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long22 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits((int) (short) 10);
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
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
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
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long22 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        long long21 = bitInputStream2.readBits((int) (short) 0);
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass26 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
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
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        java.io.InputStream inputStream0 = null;
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
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long22 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) (byte) 100);
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
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
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
        java.lang.Class<?> wildcardClass21 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
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
        java.lang.Class<?> wildcardClass21 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
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
            long long16 = bitInputStream2.readBits(1);
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
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
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
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
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
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
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
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
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
            long long21 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits((int) '4');
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
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
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
        long long15 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long26 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
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
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
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
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
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
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        java.lang.Class<?> wildcardClass28 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
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
            long long15 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
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
            long long16 = bitInputStream2.readBits((int) (byte) 1);
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
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
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
            long long16 = bitInputStream2.readBits((int) 'a');
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
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) 'a');
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
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
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
        // The following exception was thrown during execution in test generation
        try {
            long long14 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits((int) (short) 100);
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
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        java.io.InputStream inputStream0 = null;
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
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
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
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
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
            long long16 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
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
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
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
            long long21 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
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
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
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
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        long long10 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = bitInputStream2.readBits((int) '4');
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
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
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
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
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
            long long18 = bitInputStream2.readBits((int) (byte) 1);
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
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        java.io.InputStream inputStream0 = null;
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
            long long21 = bitInputStream2.readBits((int) (short) 1);
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
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
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
        // The following exception was thrown during execution in test generation
        try {
            long long14 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
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
        java.lang.Class<?> wildcardClass31 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
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
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
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
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        java.io.InputStream inputStream0 = null;
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
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
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
        java.lang.Class<?> wildcardClass19 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        java.io.InputStream inputStream0 = null;
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
            long long21 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
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
        java.lang.Class<?> wildcardClass19 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
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
            long long21 = bitInputStream2.readBits((int) (short) 1);
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
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        java.io.InputStream inputStream0 = null;
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
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
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
        java.lang.Class<?> wildcardClass19 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
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
            long long19 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        java.io.InputStream inputStream0 = null;
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
            long long25 = bitInputStream2.readBits((int) '#');
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
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long9 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass12 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
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
            long long17 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            bitInputStream2.close();
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
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        java.io.InputStream inputStream0 = null;
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
            long long24 = bitInputStream2.readBits((-1));
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
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        java.lang.Class<?> wildcardClass24 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
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
        java.lang.Class<?> wildcardClass21 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
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
        java.lang.Class<?> wildcardClass17 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
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
        // The following exception was thrown during execution in test generation
        try {
            long long14 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
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
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        java.io.InputStream inputStream0 = null;
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
            long long20 = bitInputStream2.readBits((int) (byte) 100);
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
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
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
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        java.lang.Class<?> wildcardClass30 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        java.io.InputStream inputStream0 = null;
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
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
            long long12 = bitInputStream2.readBits((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
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
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        java.io.InputStream inputStream0 = null;
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
            long long27 = bitInputStream2.readBits((int) (short) 100);
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
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
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
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits((int) (byte) 1);
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
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
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
            long long29 = bitInputStream2.readBits((int) (short) 100);
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
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) '4');
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
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
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
            long long24 = bitInputStream2.readBits((int) ' ');
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
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits(100);
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
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
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
            long long14 = bitInputStream2.readBits(100);
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
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits(1);
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
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits(10);
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
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        java.lang.Class<?> wildcardClass14 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        java.lang.Class<?> wildcardClass16 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass27 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        java.io.InputStream inputStream0 = null;
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
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
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
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
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
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        java.io.InputStream inputStream0 = null;
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
            long long17 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
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
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
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
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long7 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long23 = bitInputStream2.readBits((int) (byte) 1);
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
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
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
        // The following exception was thrown during execution in test generation
        try {
            long long14 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
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
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
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
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits((int) 'a');
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
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
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
            long long21 = bitInputStream2.readBits((-1));
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
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
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
        java.lang.Class<?> wildcardClass27 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
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
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
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
        java.lang.Class<?> wildcardClass17 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) (byte) 1);
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
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
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
            long long21 = bitInputStream2.readBits(10);
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
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
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
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
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
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        java.io.InputStream inputStream0 = null;
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
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
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
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
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
            long long15 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
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
        java.lang.Class<?> wildcardClass19 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
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
            long long18 = bitInputStream2.readBits((int) '#');
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
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
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
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits((int) '4');
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
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
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
        java.lang.Class<?> wildcardClass15 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
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
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
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
            long long12 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        java.io.InputStream inputStream0 = null;
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
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
        java.lang.Class<?> wildcardClass16 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
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
        // The following exception was thrown during execution in test generation
        try {
            long long15 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
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
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
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
        java.lang.Class<?> wildcardClass17 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
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
        java.lang.Class<?> wildcardClass14 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits((int) (byte) 0);
        long long9 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long8 = bitInputStream2.readBits(0);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        java.io.InputStream inputStream0 = null;
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
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
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
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
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
            long long21 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits((int) ' ');
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
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
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
            long long16 = bitInputStream2.readBits((int) (byte) -1);
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
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
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
        // The following exception was thrown during execution in test generation
        try {
            long long15 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
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
        java.lang.Class<?> wildcardClass18 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long26 = bitInputStream2.readBits((int) (short) 100);
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
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
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
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        java.lang.Class<?> wildcardClass19 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
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
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
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
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        java.lang.Class<?> wildcardClass27 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits((-1));
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
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
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
            long long25 = bitInputStream2.readBits((int) (short) 1);
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
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
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
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long24 = bitInputStream2.readBits((int) (short) 100);
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
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long30 = bitInputStream2.readBits((int) (byte) 10);
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
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long30 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long30 = bitInputStream2.readBits(1);
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
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        java.lang.Class<?> wildcardClass16 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long25 = bitInputStream2.readBits((int) (short) 100);
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
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
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
        bitInputStream2.clearBitCache();
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long25 = bitInputStream2.readBits(10);
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
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long9 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits((int) (short) 1);
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
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
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
        java.lang.Class<?> wildcardClass16 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
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
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
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
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long31 = bitInputStream2.readBits((int) 'a');
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
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
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
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long20 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        long long9 = bitInputStream2.readBits((int) (short) 0);
        long long11 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass12 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass31 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
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
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
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
            long long17 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
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
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long16 = bitInputStream2.readBits((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
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
            long long22 = bitInputStream2.readBits((int) (byte) 10);
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
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
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
        java.lang.Class<?> wildcardClass17 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
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
        java.lang.Class<?> wildcardClass14 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
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
            long long18 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits((int) (byte) 100);
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
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
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
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
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
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long29 = bitInputStream2.readBits((int) (short) 10);
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
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        java.io.InputStream inputStream0 = null;
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
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        java.io.InputStream inputStream0 = null;
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
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
        java.lang.Class<?> wildcardClass26 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
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
        long long17 = bitInputStream2.readBits((int) (byte) 0);
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
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
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
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
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
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((-1));
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
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
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
            long long15 = bitInputStream2.readBits((int) (byte) 100);
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
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
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
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
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
            long long12 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
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
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        java.io.InputStream inputStream0 = null;
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
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
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
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) (short) 1);
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
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
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
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        java.io.InputStream inputStream0 = null;
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
            long long26 = bitInputStream2.readBits(1);
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
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        java.io.InputStream inputStream0 = null;
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
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
            long long12 = bitInputStream2.readBits((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
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
            long long19 = bitInputStream2.readBits(10);
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
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long30 = bitInputStream2.readBits((int) (byte) 10);
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
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
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
            long long21 = bitInputStream2.readBits(100);
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
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
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
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        java.lang.Class<?> wildcardClass26 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
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
        java.lang.Class<?> wildcardClass14 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
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
            long long16 = bitInputStream2.readBits((int) (byte) -1);
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
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        java.io.InputStream inputStream0 = null;
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
            long long22 = bitInputStream2.readBits((int) 'a');
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
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long21 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
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
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits((int) (byte) 1);
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
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        java.io.InputStream inputStream0 = null;
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
            long long28 = bitInputStream2.readBits((int) 'a');
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
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
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
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
        java.lang.Class<?> wildcardClass21 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
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
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
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
            bitInputStream2.close();
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
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
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
            long long22 = bitInputStream2.readBits(10);
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
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
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
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
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
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits((int) 'a');
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
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long25 = bitInputStream2.readBits(100);
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
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long26 = bitInputStream2.readBits((int) (short) 10);
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
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
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
            long long18 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
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
            bitInputStream2.close();
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
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long23 = bitInputStream2.readBits((int) '4');
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
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        java.io.InputStream inputStream0 = null;
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
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
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
            long long15 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        long long21 = bitInputStream2.readBits((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
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
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
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
        long long28 = bitInputStream2.readBits((int) (short) 0);
        java.lang.Class<?> wildcardClass29 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits((int) (byte) 10);
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
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
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
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
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
            long long15 = bitInputStream2.readBits(100);
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
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long28 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
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
        java.lang.Class<?> wildcardClass18 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
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
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
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
            long long19 = bitInputStream2.readBits((int) (short) 1);
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
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
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
        java.lang.Class<?> wildcardClass21 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
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
            long long15 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
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
            long long25 = bitInputStream2.readBits(100);
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
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long26 = bitInputStream2.readBits((int) (short) 100);
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
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits((int) (byte) -1);
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
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
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
        // The following exception was thrown during execution in test generation
        try {
            long long14 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) (short) 100);
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
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
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
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        java.io.InputStream inputStream0 = null;
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
            long long23 = bitInputStream2.readBits((int) (byte) -1);
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
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) (short) 10);
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
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits((int) (byte) 0);
        bitInputStream2.clearBitCache();
        bitInputStream2.clearBitCache();
        long long11 = bitInputStream2.readBits(0);
        java.lang.Class<?> wildcardClass12 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
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
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        java.lang.Class<?> wildcardClass27 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
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
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits(1);
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
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
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
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
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
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long17 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
        long long7 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass12 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass20 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass18 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
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
        // The following exception was thrown during execution in test generation
        try {
            bitInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
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
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
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
        java.lang.Class<?> wildcardClass19 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long24 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
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
        // The following exception was thrown during execution in test generation
        try {
            long long25 = bitInputStream2.readBits((int) (short) 1);
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
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
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
        java.lang.Class<?> wildcardClass17 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long27 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
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
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        java.io.InputStream inputStream0 = null;
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
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
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
        bitInputStream2.clearBitCache();
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
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
            long long17 = bitInputStream2.readBits((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
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
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        java.io.InputStream inputStream0 = null;
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
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        java.io.InputStream inputStream0 = null;
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
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
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
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits((int) (short) 1);
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
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
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
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
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
            long long20 = bitInputStream2.readBits((int) (short) 10);
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
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        java.io.InputStream inputStream0 = null;
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
            long long25 = bitInputStream2.readBits(1);
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
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        java.lang.Class<?> wildcardClass27 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        java.lang.Class<?> wildcardClass29 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
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
            long long14 = bitInputStream2.readBits((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long27 = bitInputStream2.readBits((int) '4');
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
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        java.io.InputStream inputStream0 = null;
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
            long long20 = bitInputStream2.readBits((int) (byte) -1);
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
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        java.io.InputStream inputStream0 = null;
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
            long long21 = bitInputStream2.readBits((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long27 = bitInputStream2.readBits((int) (byte) 100);
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
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long21 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
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
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) (short) 1);
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
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        java.io.InputStream inputStream0 = null;
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
        java.lang.Class<?> wildcardClass23 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
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
        java.lang.Class<?> wildcardClass25 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) (byte) 1);
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
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
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
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        java.io.InputStream inputStream0 = null;
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
            long long17 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long23 = bitInputStream2.readBits((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        long long6 = bitInputStream2.readBits((int) (byte) 0);
        long long8 = bitInputStream2.readBits((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
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
        // The following exception was thrown during execution in test generation
        try {
            long long24 = bitInputStream2.readBits((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        java.lang.Class<?> wildcardClass28 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        java.io.InputStream inputStream0 = null;
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
            long long29 = bitInputStream2.readBits(10);
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
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
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
            long long22 = bitInputStream2.readBits(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
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
        // The following exception was thrown during execution in test generation
        try {
            long long20 = bitInputStream2.readBits(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        long long4 = bitInputStream2.readBits((int) (short) 0);
        bitInputStream2.clearBitCache();
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
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        java.io.InputStream inputStream0 = null;
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
            long long30 = bitInputStream2.readBits((-1));
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
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
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
            long long17 = bitInputStream2.readBits((int) 'a');
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
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
        org.apache.commons.compress.utils.BitInputStream bitInputStream2 = new org.apache.commons.compress.utils.BitInputStream(inputStream0, byteOrder1);
        bitInputStream2.clearBitCache();
        long long5 = bitInputStream2.readBits((int) (short) 0);
        long long7 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        long long10 = bitInputStream2.readBits(0);
        bitInputStream2.clearBitCache();
        java.lang.Class<?> wildcardClass12 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long21 = bitInputStream2.readBits((int) '#');
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
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = bitInputStream2.readBits((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
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
            long long23 = bitInputStream2.readBits((int) (byte) 10);
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
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
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
            long long22 = bitInputStream2.readBits((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        java.io.InputStream inputStream0 = null;
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        java.io.InputStream inputStream0 = null;
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
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        java.lang.Class<?> wildcardClass26 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long26 = bitInputStream2.readBits((int) '4');
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
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
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
            long long18 = bitInputStream2.readBits((int) (short) 1);
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
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
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
            long long20 = bitInputStream2.readBits((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
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
            long long23 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
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
            long long18 = bitInputStream2.readBits((int) (short) 10);
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
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        java.io.InputStream inputStream0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long17 = bitInputStream2.readBits(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
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
        bitInputStream2.clearBitCache();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long17 = bitInputStream2.readBits((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
            long long24 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
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
            long long25 = bitInputStream2.readBits((int) (short) -1);
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
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
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
            long long20 = bitInputStream2.readBits((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = bitInputStream2.readBits((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: count must not be negative or greater than 63");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        java.io.InputStream inputStream0 = null;
        java.nio.ByteOrder byteOrder1 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = bitInputStream2.readBits(1);
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
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
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
        java.lang.Class<?> wildcardClass16 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
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
        java.lang.Class<?> wildcardClass22 = bitInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }
}

