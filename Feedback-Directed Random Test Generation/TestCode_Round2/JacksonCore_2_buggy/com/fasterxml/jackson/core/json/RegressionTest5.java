package com.fasterxml.jackson.core.json;

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
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '4');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '4');
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 10, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray8, (int) (short) 1, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 0, (byte) 100 });
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray6, 1, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1 });
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 10, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray11, (int) (short) -1, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) -1 });
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] {});
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 100, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray10, 10, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 10, (byte) 10 });
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray10, 0, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 1, (byte) 100 });
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '4');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 0);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, (int) (byte) -1, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray7, 10, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 1 });
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        int[] intArray4 = new int[] { (byte) 100, (short) -1, (short) 0, (short) -1 };
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), 0, (-1) });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, (-1), 0, (-1), 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 100, (-1), 0, (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 100, (-1), 0, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) 'a', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray7, (int) (short) 0, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 0 });
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray8, (int) (short) 10, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '#');
        java.lang.Class<?> wildcardClass9 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) ' ');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) ' ');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray8, 1, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '#');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray7, (int) (short) 100, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100 });
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '#');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray9, (int) (byte) -1, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 10 });
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, (int) (short) 0, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, 100, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        java.lang.Class<?> wildcardClass5 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray10, (int) (short) 1, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 100, (byte) 100 });
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) 'a', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray10, (int) (byte) 10, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) -1, (byte) 10 });
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, 0, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 10);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        int[] intArray0 = new int[] {};
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray6, 100, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1 });
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray11, 10, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) -1, (byte) -1, (byte) 0 });
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) ' ', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray11, (int) (short) 10, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 });
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '#', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray6, (int) (short) 10, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0 });
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 10, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray7, (int) 'a', 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 1 });
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 100);
        java.lang.Class<?> wildcardClass9 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '#');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) -1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 0);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray6, 100, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10 });
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 100);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 100);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '#');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (-1));
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass7 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        int[] intArray4 = new int[] { (byte) 100, (short) -1, (short) 0, (short) -1 };
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), 0, (-1) });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, (-1), 0, (-1), 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 100, (-1), 0, (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 100, (-1), 0 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray11, (int) '4', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 1, (byte) 10, (byte) -1 });
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) ' ');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 10, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, 1, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) ' ', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray10, (int) 'a', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) -1, (byte) 10 });
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) '4');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 0);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) ' ');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 10);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray9, (int) (byte) 100, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 100 });
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 10, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, (int) ' ', (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) -1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray9, (int) (byte) 1, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1 });
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray9, 10, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 0 });
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray8, 1, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 100, (byte) 100 });
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) ' ');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (short) 100);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '4');
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray7, (int) (byte) -1, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) -1 });
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray9, (int) ' ', (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 0 });
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) ' ');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '#', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray8, 0, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 100, (byte) 1 });
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) ' ');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 10);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) ' ');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '4');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) -1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 100);
        java.lang.Class<?> wildcardClass17 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) 'a');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) 'a');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '4');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass5 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '4', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, (int) ' ', (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray10, (int) (byte) 100, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 100, (byte) 100 });
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 10);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 10);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray7, 1, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100 });
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) 'a');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 100);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass5 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) -1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 10);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (-1));
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 0);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, (-1), (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (-1));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray10, (int) '#', (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 10, (byte) -1 });
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, (int) (byte) 0, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, (int) '#', (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, 100, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) ' ', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray11, (int) (byte) 10, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray11, (int) (byte) 0, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 10, (byte) 1 });
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        int[] intArray4 = new int[] { (byte) 100, (short) -1, (short) 0, (short) -1 };
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (-1));
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 10);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), 0, (-1) });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, (-1), 0, (-1), 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 100, (-1), 0, (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 100, (-1), 0, (-1), 0, 0 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 100, (-1), 0, (-1), 0 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 100, (-1), 0, (-1), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) ' ');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) ' ');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) '#');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) ' ');
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, (int) (short) 0);
        int[] intArray22 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, (int) (short) 0);
        java.lang.Class<?> wildcardClass23 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '#');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) -1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray11, (int) 'a', 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) -1, (byte) 10, (byte) 0 });
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (-1));
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 10, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray9, (int) (short) 0, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, (-1), 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 10);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) -1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 10, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray7, (int) (byte) 10, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 0 });
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 10, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray7, (int) '4', (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 0 });
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) 'a');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 10);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray9, (int) (short) 1, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10 });
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) ' ');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) '#');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) ' ', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray8, (int) (short) 10, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) -1, (byte) -1 });
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (-1));
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '4');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) -1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) '#');
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) -1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 100);
        java.lang.Class<?> wildcardClass5 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 10, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray6, (int) (short) 10, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1 });
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        int[] intArray4 = new int[] { (byte) 100, (short) -1, (short) 0, (short) -1 };
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 10);
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), 0, (-1) });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, (-1), 0, (-1), 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 100, (-1), 0, (-1) });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 100, (-1), 0, (-1), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) ' ');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) ' ');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) '#');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 10);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) 'a');
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) 'a');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray6, (int) (short) -1, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0 });
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray6, (int) '#', (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1 });
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 100, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray6, (int) (short) 10, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0 });
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray9, 100, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 100, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray9, (int) 'a', (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 100 });
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray8, (int) (short) 100, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 100);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 100);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '#', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray6, 0, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0 });
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) ' ', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, (int) (byte) 1, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray11, 100, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray6, 100, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10 });
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '4');
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) -1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray9, (int) '#', (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 1 });
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) ' ', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray11, (-1), (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 });
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        int[] intArray0 = new int[] {};
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) '4');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray8, 1, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) -1, (byte) 1 });
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) 'a', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray6, (int) (short) -1, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1 });
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) ' ', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray7, (int) '#', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) -1 });
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 10, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray11, (int) (short) 100, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 10, (byte) 10, (byte) 0 });
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray6, (int) (byte) 0, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1 });
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) 'a', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, 100, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) ' ');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) ' ');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) '#');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (byte) 10);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) '4');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray8, 0, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) -1, (byte) -1 });
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) ' ');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '4');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) ' ');
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray6, (int) (byte) -1, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1 });
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '#');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) 'a');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) '#');
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, (int) '#', (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray10, 100, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 10, (byte) 10 });
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) -1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, 100, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        java.lang.Class<?> wildcardClass11 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (-1));
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '4');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) ' ');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) 'a');
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (-1));
        java.lang.Class<?> wildcardClass21 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, (int) (byte) -1, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 10, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray6, (int) (byte) 1, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1 });
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) 'a', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray10, (int) 'a', 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) -1 });
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 10, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray8, (int) (short) 10, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 100, (byte) 10 });
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 100, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray6, (int) (byte) 10, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10 });
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) -1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 100);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 10, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray8, (int) (byte) 0, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 100, (byte) 100 });
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) 1);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 10, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray11, (int) (byte) 1, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 0, (byte) 1, (byte) 10 });
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) 'a');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 10);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, (int) (short) 1, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) 'a', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray8, (int) (byte) 1, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 1, (byte) 100 });
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) 'a', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray11, 10, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 100, (byte) 10, (byte) 10 });
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, 0, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '#');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) ' ');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '4');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray11, (int) '#', (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) -1 });
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) ' ');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '4');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '#');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) -1);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) '4');
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (short) -1);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray10, 0, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray8, (-1), 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 0, (byte) 0 });
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray6, (int) '4', (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0 });
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) -1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 100);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) '#');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (short) 10);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 1);
        int[] intArray22 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 100);
        int[] intArray24 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray22, (int) ' ');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '4');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 1);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (-1));
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '4');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 0);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 100);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '#');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray7, 1, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0 });
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray7, 0, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) -1 });
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 10);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 0);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 1);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray6, (int) (short) 1, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1 });
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, (int) (byte) 0, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        int[] intArray4 = new int[] { (byte) 100, (short) -1, (short) 0, (short) -1 };
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) '#');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 100);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 100);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), 0, (-1) });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, (-1), 0, (-1), 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 100, (-1), 0, (-1), 0, 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 100, (-1), 0, (-1), 0, 0 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 10, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray10, (int) (byte) 10, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1 });
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, (int) (byte) 1, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) ' ');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '4');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) -1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '#');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) ' ');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 100, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray10, (int) (byte) 100, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) -1 });
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '#');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) ' ');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) -1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray8, (int) '#', (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '4');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) 'a');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 1);
        java.lang.Class<?> wildcardClass17 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) ' ');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) ' ');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) '#');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 10);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) '4');
        int[] intArray22 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray20, (int) (short) -1);
        int[] intArray24 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray20, 100);
        int[] intArray26 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray24, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(intArray26);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, (int) 'a', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) ' ', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, 0, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (-1));
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 10);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) ' ');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) -1);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        int[] intArray4 = new int[] { (byte) 100, (short) -1, (short) 0, (short) -1 };
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), 0, (-1) });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, (-1), 0, (-1), 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 100, (-1), 0, (-1) });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 100, (-1), 0, (-1) });
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (-1));
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '4', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray11, 0, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 100, (byte) 100, (byte) 100 });
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '#');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) ' ');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '4');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) 1);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (byte) 100);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) ' ');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) ' ');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) '#');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 10);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, (int) (short) 100);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 100, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray8, (int) (short) 1, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 1, (byte) 0 });
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (-1));
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) 'a');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) 'a', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray9, (int) (byte) -1, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        int[] intArray0 = new int[] {};
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 10, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray9, (int) '#', (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10 });
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) 'a');
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) 'a');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 100);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray8, (int) (short) 10, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 0, (byte) -1 });
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 10, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray9, (int) (byte) -1, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 1 });
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '#');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 100);
        java.lang.Class<?> wildcardClass9 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, 0, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 100, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray6, (int) ' ', (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10 });
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 10, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray8, (int) (byte) 1, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 1, (byte) 100 });
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray9, (int) (short) -1, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 1 });
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) ' ');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '4');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 10);
        java.lang.Class<?> wildcardClass15 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 10, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray9, (int) '4', (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) -1 });
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray6, (int) (byte) 0, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1 });
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray11, 1, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) -1 });
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray8, (int) '4', 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 10, (byte) 100 });
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) -1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 100);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) '#');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (short) 10);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray9, (int) (short) 10, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1 });
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) ' ');
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray8, (int) ' ', 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 0, (byte) 0 });
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '4');
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 10, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, (int) (byte) 10, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 100);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 100);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, (int) (byte) 1, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '4');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 10);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) 'a');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '#');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 0);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (short) -1);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, (int) '4', (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '#');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 10);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) 'a');
        java.lang.Class<?> wildcardClass17 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '4');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) '4');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '4');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray7, (int) 'a', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10 });
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray7, (int) (short) 1, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 0 });
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray7, 10, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 0 });
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 0);
        java.lang.Class<?> wildcardClass5 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) ' ', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, (int) (byte) 0, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray10, (int) (short) -1, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 100, (byte) 1 });
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '4', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, (int) (byte) -1, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray11, 1, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1 });
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 1);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 1);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) ' ');
        java.lang.Class<?> wildcardClass5 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (-1));
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) -1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 100);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 10, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray8, 0, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 10, (byte) -1 });
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (-1));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) 'a');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 10);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 0);
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray8, (-1), (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 1, (byte) 0 });
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '#', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray11, (int) (byte) 0, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) -1, (byte) 100, (byte) 10 });
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (-1));
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) -1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) '#');
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '#', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, 1, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 100, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray10, 0, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray7, (int) (byte) -1, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 100 });
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '4');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 1);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (short) 0);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) '4');
        java.lang.Class<?> wildcardClass21 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 100, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray6, (int) ' ', (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100 });
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray7, 10, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100 });
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray11, (int) ' ', 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 1, (byte) -1 });
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '#');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 1);
        java.lang.Class<?> wildcardClass13 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 100, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray7, (int) (byte) 100, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1 });
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) 'a', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, 100, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 10);
        java.lang.Class<?> wildcardClass17 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray7, 1, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 0 });
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        int[] intArray0 = new int[] {};
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '#', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, 1, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '#');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (-1));
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) ' ');
        java.lang.Class<?> wildcardClass9 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 10, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray9, 0, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) -1 });
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray8, (int) (byte) -1, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) ' ');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '4');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '#');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) -1);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, 100);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, (int) (short) 10, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray10, (int) (byte) 10, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) 10 });
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '#');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) -1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 0);
        java.lang.Class<?> wildcardClass17 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray7, 1, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 100 });
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) 'a');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 100);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) 'a');
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray6, (-1), (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100 });
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        int[] intArray0 = new int[] {};
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '#');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, (int) (short) 10, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '#');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (-1));
        java.lang.Class<?> wildcardClass11 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 100, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray9, 0, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 100 });
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray6, (int) (short) 100, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1 });
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, (int) (short) 0, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) ' ');
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) -1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray6, (int) '4', (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1 });
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (-1));
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '4');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 100);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) '4');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) ' ', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray7, (-1), (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100 });
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, (int) '4', (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray10, (int) '#', (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 100);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) ' ');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (-1));
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) 'a');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, (int) '4', (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '4');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '4');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 10);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 100, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray11, 10, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray6, (int) (short) 0, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10 });
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, (int) (short) 0, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray8, (int) (short) -1, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 100, (byte) 1 });
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) -1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 100);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) '#');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (short) 10);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 1);
        java.lang.Class<?> wildcardClass21 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 100, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray6, (int) '#', (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1 });
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray7, (int) (byte) 0, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100 });
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) 'a');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '4');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) 'a');
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, (int) (byte) 100, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, (int) '#', (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 0);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '4');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 1);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (short) 0);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) '4');
        int[] intArray22 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (short) 100);
        int[] intArray24 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray22, (int) '#');
        java.lang.Class<?> wildcardClass25 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) ' ');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) ' ');
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (-1));
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 100);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray7, (int) (byte) 0, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10 });
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray7, (int) 'a', 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) -1 });
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) ' ');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) 'a');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) ' ');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) ' ');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) '#');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) ' ');
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, (int) (short) 0);
        int[] intArray22 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, (int) (short) 0);
        int[] intArray24 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, (int) '4');
        int[] intArray26 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, (int) ' ');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(intArray26);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '4', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray8, 1, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 1, (byte) 100 });
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray7, (int) (short) 1, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) -1 });
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray8, 10, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 1, (byte) 0 });
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '4', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray9, (int) '#', (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10 });
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) -1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray11, 10, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) -1, (byte) 100, (byte) 100 });
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, (int) (short) 0, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 10);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 10);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray8, 100, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 1 });
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) ' ');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '4');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (-1));
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        int[] intArray4 = new int[] { (byte) 100, (short) -1, (short) 0, (short) -1 };
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) 'a');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), 0, (-1) });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, (-1), 0, (-1), 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 100, (-1), 0, (-1), 0, 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 100, (-1), 0, (-1), 0, 0 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '4');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) -1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 10, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, (-1), (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray9, (int) (short) 1, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 100 });
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) ' ');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (-1));
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 10);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) 'a');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 0);
        java.lang.Class<?> wildcardClass15 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '4');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) ' ');
        java.lang.Class<?> wildcardClass15 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray9, 0, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 0 });
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) 'a');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 100);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (-1));
        java.lang.Class<?> wildcardClass19 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) -1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray8, (int) (short) 1, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 10, (byte) 1 });
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, (int) '4', (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray9, (int) (byte) 100, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) -1 });
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 10, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray7, (int) '#', 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 100 });
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (-1));
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) '#');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass5 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 100, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray11, 1, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (-1));
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '4');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) ' ');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) 'a');
        java.lang.Class<?> wildcardClass19 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray11, (int) (byte) -1, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) -1 });
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '#');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 10, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray7, (int) (byte) -1, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100 });
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '#');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '4');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray7, (-1), (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 0 });
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray8, 0, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 0, (byte) 10 });
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        int[] intArray4 = new int[] { (byte) 100, (short) -1, (short) 0, (short) -1 };
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (-1));
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 10);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 10);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) ' ');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), 0, (-1) });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, (-1), 0, (-1), 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 100, (-1), 0, (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 100, (-1), 0, (-1), 0, 0 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 100, (-1), 0, (-1), 0 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 100, (-1), 0, (-1), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 100, (-1), 0, (-1), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) ' ');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 10);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) -1);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (byte) 0);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, (int) (short) -1);
        int[] intArray22 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray20, (int) (short) 100);
        java.lang.Class<?> wildcardClass23 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 100, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray6, (int) (byte) 0, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1 });
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) ' ', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray8, (int) (short) 100, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 100, (byte) 0 });
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '#');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (-1));
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '4');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '4');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) '4');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) '4');
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '#');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray7, (int) (short) 1, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100 });
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 10);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) ' ');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) 'a', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray7, (int) (byte) 100, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) -1 });
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray9, (-1), 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 1 });
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (-1));
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 10);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 100);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '4');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) 'a', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray9, (int) (short) 0, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 1 });
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) ' ');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, (int) (short) -1, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '#');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) 'a');
        java.lang.Class<?> wildcardClass15 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 100);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 100);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (-1));
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '#');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) ' ', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray8, (int) '#', (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (-1));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, 0, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray11, (int) (byte) 1, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) ' ');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) '#');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 10, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray9, (int) (short) 100, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 0 });
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '#');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '4');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (-1));
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '4');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (short) 10);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, 0);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (short) 100);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray6, (int) (byte) 1, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10 });
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) ' ');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '4', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray11, (int) (byte) 1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) -1, (byte) 0, (byte) 0 });
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) -1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray9, 0, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0 });
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray8, (int) 'a', 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 0, (byte) -1 });
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) ' ');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) ' ');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) 10);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) 1);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, (int) (short) 10);
        java.lang.Class<?> wildcardClass21 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) ' ', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray6, 0, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0 });
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass7 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 10, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray8, (int) (byte) 0, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 10, (byte) 0 });
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 10);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 100);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, (int) '4');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 10);
        java.lang.Class<?> wildcardClass9 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray7, (int) (byte) 100, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100 });
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '4');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) 'a');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) ' ');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '4');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '#');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) -1);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, 100);
        java.lang.Class<?> wildcardClass19 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 10);
        java.lang.Class<?> wildcardClass9 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray10, (int) (byte) -1, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 100, (byte) 10 });
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray6, 10, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0 });
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray7, (int) (short) 1, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 0 });
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 10, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray8, (int) ' ', (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray10, (int) '4', 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 100, (byte) 10 });
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 10, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray10, (int) (short) 0, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 10 });
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) 'a');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 100);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray6, (int) '#', (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100 });
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) ' ');
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '#');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) ' ');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '4');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        int[] intArray4 = new int[] { (byte) 100, (short) -1, (short) 0, (short) -1 };
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), 0, (-1) });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, (-1), 0, (-1), 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 100, (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 100, (-1), 0, (-1), 0 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, 10, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '#');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 100);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 100, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray7, (int) (short) 100, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 10 });
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray8, (int) ' ', (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 10, (byte) 0 });
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, (int) (byte) 0, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        int[] intArray4 = new int[] { (byte) 100, (short) -1, (short) 0, (short) -1 };
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), 0, (-1) });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, (-1), 0, (-1), 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 100, (-1), 0, (-1), 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 100, (-1), 0, (-1), 0, 0 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 100, (-1), 0, (-1) });
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '4', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray10, (int) (short) 10, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 100 });
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '4', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray8, 100, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) 'a');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '#');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) ' ');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) ' ');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 10);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) '#');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) ' ');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) ' ');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) '#');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) -1);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 1);
        int[] intArray22 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) '4');
        int[] intArray24 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray22, (int) (byte) -1);
        int[] intArray26 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray24, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(intArray26);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '#');
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) 'a', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray10, (int) (byte) -1, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) 'a');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (-1));
        java.lang.Class<?> wildcardClass15 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '4');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 0);
        java.lang.Class<?> wildcardClass15 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 0);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '#', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray6, 0, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1 });
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '#');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, (int) (short) 1, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, (int) 'a', 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray11, (int) '#', 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 100, (byte) 100, (byte) -1 });
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) ' ');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) ' ');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) 'a');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 0);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, (-1));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray9, (-1), (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 10 });
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray9, (int) (byte) 0, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 0 });
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        int[] intArray4 = new int[] { (byte) 100, (short) -1, (short) 0, (short) -1 };
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), 0, (-1) });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, (-1), 0, (-1), 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 100, (-1), 0, (-1), 0, 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 100, (-1), 0, (-1), 0 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 100, (-1), 0, (-1), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray8, (int) (short) -1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (-1));
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '4');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 100);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 0);
        java.lang.Class<?> wildcardClass17 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (-1));
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) ' ');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) ' ');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) '#');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 10);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 10);
        int[] intArray22 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray20, (int) (byte) -1);
        java.lang.Class<?> wildcardClass23 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '#');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) ' ');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '4');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) -1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray10, 100, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 0, (byte) 0 });
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) ' ');
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (-1));
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '4');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray6, (int) (short) 100, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10 });
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '4');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) 'a');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) ' ');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) ' ');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) '#');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 10);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) '4');
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray8, (int) (short) 100, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 0, (byte) -1 });
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray10, (int) (short) -1, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 100, (byte) -1 });
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 10);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (-1));
        java.lang.Class<?> wildcardClass9 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 10, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray7, (int) (short) 100, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100 });
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray9, (int) (byte) -1, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        int[] intArray4 = new int[] { (byte) 100, (short) -1, (short) 0, (short) -1 };
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) '#');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 100);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, 1);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, (-1), 0, (-1) });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, (-1), 0, (-1), 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 100, (-1), 0, (-1), 0, 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 100, (-1), 0, (-1), 0, 0 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray7, (int) (byte) 100, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 10 });
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray10, (int) (byte) 0, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) -1, (byte) 10 });
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 0, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray9, (int) ' ', (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) -1 });
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) 'a', inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray9, (int) (short) 10, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 10 });
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (-1));
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (short) 10);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer bytesToNameCanonicalizer4 = null;
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 10, inputStream2, objectCodec3, bytesToNameCanonicalizer4, byteArray5, (int) '4', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (-1));
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (-1));
        java.lang.Class<?> wildcardClass15 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }
}

