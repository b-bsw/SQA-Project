package com.fasterxml.jackson.core.json;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { '#', '#', '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, 1, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '#', '4', '4' });
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) (byte) -1, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', ' ' });
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { 'a', 'a', '4', '4', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) '4', reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) (short) -1, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a', 'a', '4', '4', '#', 'a' });
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { 'a', '#', ' ', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (-1), reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) 'a', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', '#', ' ', '#', 'a' });
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (-1), 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', ' ' });
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) 'a', (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) (short) 100, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', ' ' });
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, (int) (short) 100, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 0, (byte) 1, (byte) 100 });
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) 'a', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) (byte) 0, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 100, (byte) 0 });
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (-1), (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0 });
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (-1), (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '#', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, 0, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) ' ', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (-1), (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1 });
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { '#', '#', '4', '4', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, 10, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '#', '4', '4', 'a', 'a' });
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '#');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass7 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { 'a', '4', 'a', '4', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) 'a', reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, 1, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a', '4', 'a', '4', ' ', 'a' });
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) (short) 0, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) ' ');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 10);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) ' ');
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
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '#', '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) (short) 10, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', '4', '4' });
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (int) (short) 1, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100 });
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) ' ');
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '#', '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, 0, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', '4', 'a' });
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, 0, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 100, (byte) -1 });
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (int) (short) 0, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0 });
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { ' ', ' ', 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, 0, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', ' ', 'a', '#' });
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 0);
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
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) -1);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, 0, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4' });
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) '4', (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) -1, (byte) 0 });
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 10);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 10);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) -1);
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
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, 1, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) -1, (byte) 10, (byte) 10 });
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) (byte) 100, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 100 });
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '#', 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, 100, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', 'a', ' ' });
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '#');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 100);
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
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '#', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (int) (short) -1, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 0 });
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass5 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) (byte) 10, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 1, (byte) -1 });
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 0);
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
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass5 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { '#', 'a', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, 0, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', 'a', '#', ' ' });
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, 10, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 0 });
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 10);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (-1));
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 100);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) -1);
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
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { 'a', '#', 'a', 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, 0, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', '#', 'a', 'a', ' ' });
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) ' ', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, 1, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { '#', '#', '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (int) (short) 1, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '#', '4', 'a' });
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, 100, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) (byte) 0, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 10 });
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, (int) (byte) 1, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a' });
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, 0, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 0, (byte) 0 });
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass7 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) (byte) 1, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) 0 });
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) (short) -1, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 1, (byte) 0 });
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, (int) '4', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a' });
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '4');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 0);
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
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '#');
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
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { ' ', '#', ' ', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) '#', reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) (byte) -1, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { ' ', '#', ' ', 'a', 'a' });
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 1);
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
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 1);
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
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, 10, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (byte) 0, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (-1), reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) (byte) 1, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', ' ' });
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { '4', '#', '4', 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) (short) 10, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '#', '4', 'a', '#' });
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) '#', (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 0, (byte) 1 });
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) (byte) 0, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '#');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '4', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, 0, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100 });
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { '#', 'a', 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (int) (byte) -1, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', 'a', 'a', '4' });
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (short) 1);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (-1));
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
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, 0, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 0 });
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (-1));
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 100);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) 'a');
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
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (int) '4', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10 });
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '4', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, 1, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 100 });
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) (byte) 10, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0 });
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 0);
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
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (short) 0, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (-1));
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) 'a');
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
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, (int) (short) 10, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 100 });
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) ' ', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, 10, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 0 });
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (-1));
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '#');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) -1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 10);
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
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (int) (byte) 10, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1 });
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '4', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) 'a', reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) (short) 10, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', ' ' });
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { 'a', '4', ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, 10, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '4', ' ', '#' });
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (byte) 1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 10);
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
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (-1), (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) '4', (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) '4', (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', ' ' });
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { ' ', '#', '#', '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) '4', reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, 0, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { ' ', '#', '#', '4', 'a' });
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) (short) 100, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) -1 });
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (-1));
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
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (int) (byte) -1, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1 });
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { '#', ' ', 'a', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) (short) 1, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', ' ', 'a', 'a', 'a' });
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (int) '#', (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1 });
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { '4', ' ', '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (-1), (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', ' ', '4', '#' });
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (int) (short) 0, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1 });
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { '#', 'a', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (int) (short) 1, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', 'a', '#', 'a' });
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (int) '4', 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10 });
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 1);
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
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 10);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) 100);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (short) 10);
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
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) (short) 1, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 0 });
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '4', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (int) (byte) 10, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 1 });
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) (byte) 1, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 100, (byte) -1 });
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) ' ', (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', ' ' });
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) 'a', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (int) (byte) 100, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10 });
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, 100, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100 });
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) -1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 100);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 10);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, 1);
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
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (-1), (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1 });
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (int) (short) 100, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1 });
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 0);
        java.lang.Class<?> wildcardClass13 = intArray4.getClass();
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
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { 'a', 'a', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (int) '#', (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', 'a', '#', 'a' });
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { ' ', '#', '4', ' ', '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (-1), (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { ' ', '#', '4', ' ', '4', '4' });
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '#', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (int) (short) 10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 0 });
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 10);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (int) (byte) 100, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0 });
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) ' ');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 10);
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
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (-1));
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) 0);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) 1);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, (int) (byte) 0);
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
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) '#', reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) '4', (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass7 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) (byte) -1, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 0 });
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) '4', (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 100 });
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) '#', reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, (int) (short) 10, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#' });
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 100);
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (int) (short) 1, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0 });
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, 0, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) '4', reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, 1, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '4');
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, (-1));
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
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { '#', ' ', '4', '4', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) (byte) 10, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', ' ', '4', '4', '#', 'a' });
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) 'a', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) ' ', (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 0, (byte) -1 });
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { ' ', '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, 1, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { ' ', '4', 'a' });
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, 0, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 1, (byte) -1 });
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { '4', '4', 'a', '#', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) (short) 10, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4', 'a', '#', '4' });
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { '4', ' ', 'a', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) ' ', 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', ' ', 'a', '#', '#' });
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 1);
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
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) 'a');
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
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) ' ', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, 0, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 0 });
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, 1, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) 10 });
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, 1, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', 'a' });
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { 'a', 'a', 'a', 'a', '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, 10, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a', 'a', 'a', 'a', '4', '#' });
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) -1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 100);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) ' ');
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
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (int) (short) 10, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 10 });
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '#', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, (int) (short) 0, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) -1, (byte) 100, (byte) -1 });
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { ' ', 'a', '#', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) (byte) 1, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { ' ', 'a', '#', '#', ' ' });
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) 'a', reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, (int) '4', (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a' });
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '4', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, 1, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', ' ' });
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '4');
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
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { '#', 'a', '4', ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) (byte) 1, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', 'a', '4', ' ', ' ' });
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
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
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) -1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) -1);
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
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) (byte) 0, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 0, (byte) 1 });
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) (short) -1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) -1, (byte) 0 });
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, 100, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '4', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (int) (byte) 100, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100 });
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '4');
        java.lang.Class<?> wildcardClass5 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, (int) (byte) 10, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4' });
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, 0, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) 0 });
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { 'a', ' ', 'a', ' ', ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) (short) 100, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a', ' ', 'a', ' ', ' ', ' ' });
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { '4', ' ', '#', 'a', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) (byte) 100, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', '#', 'a', '#', 'a' });
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (-1));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, (int) (byte) 0, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 });
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (-1));
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) -1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) -1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 10);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (byte) 1);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (byte) 10);
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
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '#', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) (byte) -1, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 10, (byte) 100 });
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 10);
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
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (short) 1, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (short) 1);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) 10);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 10);
        int[] intArray22 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray20, (int) (short) -1);
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
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '4', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, 10, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '#' });
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, 10, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, 0, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 0 });
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 100);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) ' ', (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', ' ' });
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 10);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 1);
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
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0 });
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (-1));
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 0);
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
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) (byte) 0, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass5 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (-1));
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '#');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
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
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
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
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { 'a', 'a', 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) 'a', reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, 0, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', 'a', 'a', '4' });
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, 0, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (short) 100, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) -1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
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
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { ' ', 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) ' ', 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { ' ', 'a', ' ' });
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        int[] intArray3 = new int[] { ' ', (short) 1, 10 };
        int[] intArray5 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray3, (int) '4');
        int[] intArray7 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray5, (int) ' ');
        int[] intArray9 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray7, (int) (byte) -1);
        java.lang.Class<?> wildcardClass10 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 32, 1, 10 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, 10, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1 });
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, (-1), (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 0, (byte) 100 });
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) ' ', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', 'a' });
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { '4', '4', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (int) '#', (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '#', '#' });
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) (short) -1, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) -1 });
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, 0, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 1 });
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '#', 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) (short) 1, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', 'a', ' ' });
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) 'a', reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, 0, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) '4', reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) (byte) 100, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '#' });
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) -1);
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
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) 'a', (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (-1), (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 0);
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
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) (byte) 10, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, 0, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 0, (byte) -1, (byte) 1 });
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { 'a', '#', 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (int) (byte) 0, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', '#' });
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 0);
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
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { '#', ' ', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, 0, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', ' ', '#', ' ' });
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (int) (byte) 100, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 100 });
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) '4');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 10);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (-1));
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (byte) 100);
        int[] intArray22 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray20, 0);
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
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { 'a', '4', '4', '4', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, 0, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a', '4', '4', '4', '#', '#' });
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 10);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '4');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 0);
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
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, (int) ' ', (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) '#', (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) -1 });
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) -1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
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
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (int) (byte) -1, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10 });
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) (short) -1, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', '#' });
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (int) '#', (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 0 });
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) ' ');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, 10, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 100 });
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 10);
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
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 10);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 1);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 0);
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
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) 'a', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) (byte) -1, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 1, (byte) 10 });
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { ' ', '4', '4', 'a', 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, 10, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { ' ', '4', '4', 'a', 'a', '#' });
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { '4', '#', ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (int) (short) -1, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '#', ' ', ' ' });
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, 10, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '4');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 10);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (byte) -1);
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
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (-1));
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) -1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '4');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, 1);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, (int) (byte) 1);
        int[] intArray22 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray20, (int) (byte) 0);
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
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 10);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
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
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { '4', ' ', ' ', ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) 'a', (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', ' ', ' ', ' ', ' ' });
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (-1));
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) 0);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) 0);
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
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '#');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (short) -1);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 100);
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
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) -1);
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
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, 10, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0 });
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) (byte) 0, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) '#');
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
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (byte) -1);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, (int) (short) 0);
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
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) ' ', (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, (int) 'a', 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 100, (byte) 10, (byte) 100 });
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) 'a', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (-1), (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 10, (byte) 10 });
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 100);
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
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { '#', ' ', 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) '#', reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, 100, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', ' ', 'a', '4' });
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) (short) 0, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 0 });
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) -1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 0);
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
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 100);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) '#');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (short) 0);
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
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { ' ', ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, 0, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { ' ', ' ', '4' });
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '#');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) ' ');
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
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (short) -1, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 0);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (short) 10);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, 0);
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
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) (short) 1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 100);
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
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) (short) 100, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '4');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 100);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (-1));
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 0);
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
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '#', ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, 1, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', ' ', '4' });
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { '4', '#', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (int) (short) 1, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '#', '#', ' ' });
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) '4', reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, (int) (short) 1, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a' });
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { ' ', ' ', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, 0, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', ' ', ' ', 'a' });
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { '4', 'a', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) 'a', reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (int) (short) 100, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', 'a', '#', '#' });
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 100);
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
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) (short) 0, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 100, (byte) 1 });
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) 'a', reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (short) 1, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, 100, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1 });
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { '4', ' ', '4', '#', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (-1), reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) (short) -1, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', '4', '#', ' ', 'a' });
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (-1), (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 100, (byte) 100 });
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, 0, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 100, (byte) 10 });
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '#');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (short) 10);
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
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '4', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) 'a', (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', ' ', 'a' });
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 10);
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
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (-1));
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) -1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) -1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 10);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (byte) 1);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (byte) 10);
        int[] intArray22 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) 'a');
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
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) (short) 0, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (-1), (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 1, (byte) 100 });
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { ' ', '4', '4', 'a', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, 100, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { ' ', '4', '4', 'a', '#', ' ' });
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) '#');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 0);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) ' ');
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, (int) (short) 10);
        int[] intArray22 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray20, 0);
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
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { 'a', ' ', 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, 100, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', ' ', 'a', '4' });
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 0);
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
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) 'a', (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 100, (byte) -1 });
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) 'a', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1 });
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { 'a', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) 'a', reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) '4', (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', 'a', 'a' });
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 10);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (-1));
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 100);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 100);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (short) -1);
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
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, 10, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4' });
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '#', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) (byte) -1, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100 });
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) '4', 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) '#', (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) ' ', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) 'a', (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) -1 });
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) (byte) 100, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100 });
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '#');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) ' ');
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
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, 0, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 100, (byte) -1 });
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { 'a', '#', '#', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) '4', (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', '#', '#', '#', ' ' });
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 0);
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
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { '#', ' ', 'a', '4', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) (short) 1, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', ' ', 'a', '4', 'a', 'a' });
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { '4', ' ', '4', '4', 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) ' ', reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, 0, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', '4', '4', 'a', '#' });
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) (byte) 1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) -1 });
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '#', '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) (short) 1, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', '4', '#' });
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (-1), (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '4', '#', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) (short) 100, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '4' });
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) -1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 10);
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
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '4', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) (byte) -1, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (int) '#', (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 0 });
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 10);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '#');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) -1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) -1);
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
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 0);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 0);
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
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) (byte) 1, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) -1 });
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '#');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 0);
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
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) (byte) -1, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 100, (byte) 1 });
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { ' ', ' ', '#', '4', '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) (short) 0, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { ' ', ' ', '#', '4', '4', '4' });
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) (byte) 0, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '4');
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
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) -1);
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
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { ' ', ' ', '#', ' ', 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) '#', reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) (byte) 0, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { ' ', ' ', '#', ' ', 'a', '4' });
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, (int) (byte) -1, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { ' ' });
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { ' ', 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, 1, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { ' ', 'a', ' ' });
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) (byte) 10, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', ' ' });
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { '#', 'a', ' ', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) ' ', 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', 'a', ' ', '#', 'a' });
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '4');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 100);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) -1);
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
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, 10, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (int) (byte) -1, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1 });
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, (int) (short) 10, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { ' ' });
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, 10, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '#');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) (short) 0, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 10 });
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) '4', (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 10 });
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 100);
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
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { '#', ' ', ' ', 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (-1), reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) '4', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', ' ', ' ', 'a', ' ' });
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (-1));
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) -1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) -1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 10);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (byte) 1);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (byte) 10);
        int[] intArray22 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray20, (int) (short) 10);
        int[] intArray24 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray22, (int) (short) 0);
        int[] intArray26 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray22, (int) (byte) -1);
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
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 10);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 1);
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
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (-1));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, (int) 'a', (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 100, (byte) 10, (byte) -1 });
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) (short) 1, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 1, (byte) 100 });
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (-1));
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (-1));
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 10);
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
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { ' ', 'a', '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, 0, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', 'a', '4', '#' });
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) (byte) 0, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (int) ' ', (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10 });
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (-1), (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', ' ' });
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) -1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) -1);
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
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
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, 0, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 1 });
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (int) (byte) 10, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1 });
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) 'a');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 100);
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
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 10);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 1);
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
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { 'a', ' ', ' ', 'a', 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) '#', 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a', ' ', ' ', 'a', 'a', ' ' });
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) 'a');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 1);
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
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 0);
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
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, 0, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) -1, (byte) 1 });
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 10);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 10);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 0);
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
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (-1));
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (-1), reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) (byte) 10, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '#' });
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) '4', reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (byte) -1, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) '#');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 0);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) ' ');
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, (int) (short) 10);
        int[] intArray22 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray20, 0);
        int[] intArray24 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray22, (int) (short) -1);
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
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, 1, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 10);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '4');
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
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) (byte) 10, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 100, (byte) -1 });
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (-1));
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (byte) 0);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, (int) (short) -1);
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
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { ' ', 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) '#', reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) (byte) 0, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { ' ', 'a', ' ' });
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '4');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 100);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (short) 100);
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
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, (int) (byte) 10, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 1, (byte) 10, (byte) -1 });
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) ' ', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) (byte) 1, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 1, (byte) 0 });
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (-1), 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, 0, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, (int) (byte) 1, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { ' ' });
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, 0, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', ' ' });
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) (byte) 100, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { ' ', 'a', 'a', '4', '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) (byte) 100, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { ' ', 'a', 'a', '4', '4', 'a' });
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (int) (short) -1, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1 });
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { 'a', '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) '#', (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', '4', '#' });
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { '4', ' ', 'a', ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) (byte) -1, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', ' ', 'a', ' ', '#' });
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { '#', '#', ' ', '4', 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (-1), reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) (short) -1, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '#', ' ', '4', 'a', ' ' });
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (int) (short) 0, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 0 });
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) (byte) -1, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 1 });
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 100);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 10);
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
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '4');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 10);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (short) 10);
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
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, (-1), 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 100, (byte) -1, (byte) -1 });
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, (int) (short) -1, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#' });
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (int) (short) 0, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 100 });
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) '#', (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { ' ', '#', '4', ' ', 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (-1), reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) ' ', (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { ' ', '#', '4', ' ', 'a', '4' });
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) (byte) 10, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10 });
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) ' ', (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (-1));
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) -1);
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
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (int) (short) 1, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1 });
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, 1, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10 });
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) (short) 100, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', 'a' });
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) 'a', reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) (byte) 100, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', 'a' });
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) ' ');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 100);
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
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { '4', 'a', 'a', '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (-1), reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) (byte) 100, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', 'a', 'a', '4', '#' });
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { 'a', 'a', '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (int) (short) -1, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', 'a', '4', '#' });
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { '#', ' ', 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (int) (byte) 1, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', ' ', 'a', ' ' });
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { 'a', '4', '#', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (int) (short) -1, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '4', '#', '4' });
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
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
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '#', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, 1, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, 100, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', 'a' });
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) 'a', (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 1 });
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { ' ', '4', '#', 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) 'a', reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, 0, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { ' ', '4', '#', 'a', ' ' });
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) 'a', (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 10, (byte) -1 });
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) -1);
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
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { ' ', '#', 'a', 'a', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) ' ', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { ' ', '#', 'a', 'a', '#', '#' });
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { '4', '4', '4', ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) (byte) -1, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4', '4', ' ', ' ' });
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { ' ', '4', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (int) (short) 100, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', '4', '#', ' ' });
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, 1, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) -1 });
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { '#', 'a', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (int) ' ', (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', 'a', '#', '#' });
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (-1));
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (short) 0);
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
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) '4', (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, 100, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 10);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) 100);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, 100);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, 100);
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
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) (byte) 100, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', '#' });
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) (byte) 10, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '#' });
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, (int) (short) 0, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 0, (byte) 100, (byte) 1 });
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) '4', (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 100, (byte) -1 });
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { '#', ' ', '#', '4', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) (byte) 10, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', ' ', '#', '4', '#', ' ' });
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, (int) (short) 0, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (byte) 10 });
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '#', 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) (short) 0, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', 'a', '4' });
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '#', '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) 'a', reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) (byte) 10, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', '4', '#' });
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (byte) 100, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { 'a', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) (byte) 10, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', '#', '#' });
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) (byte) 1, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) -1, (byte) 1 });
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (byte) 10, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 100);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) -1);
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
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (-1));
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 100);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) 0);
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
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, (int) (byte) 10, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { ' ' });
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 10);
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
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, 100, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '4' });
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '#');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '4');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) 1);
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
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) 'a', (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) (short) 1, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', 'a' });
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) '#', reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) (short) -1, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '#' });
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) (byte) 100, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '#' });
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '#');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) 'a');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) (short) 100, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 0 });
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, (-1), (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#' });
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '#');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (-1));
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
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) '#', 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) -1, (byte) 10 });
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 10);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (-1));
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (-1));
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
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) (byte) -1, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 1, (byte) 0 });
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, (int) (byte) 100, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '4', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) '4', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1 });
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 100);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (short) 1);
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
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (int) ' ', (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { ' ', 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) (short) 100, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { ' ', 'a', '4' });
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '4');
        java.lang.Class<?> wildcardClass3 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '4', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) (byte) -1, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 1, (byte) 10 });
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { '#', '#', '#', 'a', '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) '#', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '#', '#', 'a', '4', 'a' });
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) '#', (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 100 });
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, 100, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10 });
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, 0, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { ' ' });
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { '4', 'a', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, 10, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', 'a', '#', ' ' });
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 1);
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
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, (int) (byte) 0, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { ' ' });
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, 1, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 10, (byte) 10, (byte) 1 });
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, (int) (byte) -1, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#' });
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { ' ', 'a', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (int) (short) 1, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', 'a', '#', ' ' });
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { 'a', 'a', '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (-1), (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', 'a', '4', '#' });
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (-1));
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, 100);
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
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '#', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) (short) -1, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) -1, (byte) 100 });
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, 1, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 0, (byte) 10 });
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, (int) (short) 1, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { ' ' });
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { 'a', 'a', '4', 'a', 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) (short) 0, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a', 'a', '4', 'a', 'a', '4' });
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, 1, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '#' });
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, 100, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 10, (byte) 1 });
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, 100, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100 });
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { 'a', ' ', ' ', ' ', ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) (short) 100, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a', ' ', ' ', ' ', ' ', '4' });
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, (int) '4', (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a' });
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) -1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 100);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 10);
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
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { ' ', 'a', ' ', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) (short) 1, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { ' ', 'a', ' ', 'a', 'a' });
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (-1));
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) '4');
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
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, 1, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 100);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 0);
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
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 0);
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
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) (short) 10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) ' ', 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) 0 });
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (int) (byte) 1, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10 });
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, 1, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 0, (byte) 10 });
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { ' ', '4', 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (int) (byte) 0, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', '4', 'a', '#' });
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 100);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) 'a', (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }
}

