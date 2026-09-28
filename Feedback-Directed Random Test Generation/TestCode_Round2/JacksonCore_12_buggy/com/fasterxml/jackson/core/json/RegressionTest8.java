package com.fasterxml.jackson.core.json;

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
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, 0, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) (byte) -1, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 0 });
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { '4', '4', '4', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) (byte) -1, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4', '4', '#', 'a' });
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, 0, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 100, (byte) -1, (byte) 1 });
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, 100, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) 'a', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) (byte) 100, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 10 });
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 0);
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
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) ' ');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
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
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { ' ', '4', 'a', '4', 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (-1), reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) (short) -1, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { ' ', '4', 'a', '4', 'a', '4' });
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { '4', '4', '4', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) 'a', reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) (byte) 10, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4', '4', ' ', 'a' });
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '4', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, 100, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', ' ', 'a' });
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
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
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        int[] intArray2 = new int[] { '#', '4' };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) 'a');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 35, 52 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 52, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) '4', (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 10, (byte) 1 });
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { 'a', 'a', '4', '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) '#', (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', '4', '4', '#' });
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (-1));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, 0, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4' });
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) (byte) 1, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) 'a');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
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
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '4');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) '4');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, 1);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, 1);
        int[] intArray22 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray20, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 100, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 100 });
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
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { ' ', '#', ' ', '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) ' ', reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) (byte) 10, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { ' ', '#', ' ', '4', ' ' });
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (int) (short) 1, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) -1 });
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, 1, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 1, (byte) 0 });
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) '#', (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        int[] intArray2 = new int[] { '#', '4' };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 35, 52 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 52, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 35, 52 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { ' ', 'a', '#', '4', '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) (byte) -1, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { ' ', 'a', '#', '4', '4', 'a' });
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, (int) (short) -1, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4' });
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) 'a');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (int) (short) 10, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 0 });
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 100);
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
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { ' ', ' ', '#', '#', ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, 0, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { ' ', ' ', '#', '#', ' ', ' ' });
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '#', '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, 0, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', '4', '4' });
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (byte) 10, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) 'a', 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) -1, (byte) 1 });
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) '4', reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) '#', (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { '#', ' ', '4', ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, 0, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', ' ', '4', ' ', '4' });
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { ' ', '4', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (int) (byte) 0, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', '4', '#', '#' });
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, 0, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (byte) 100, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 0);
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
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 100, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 100 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (-1), (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, 0, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 10, (byte) 1 });
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 100, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) 'a', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, (int) (short) 100, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) -1, (byte) 10, (byte) 0 });
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { '4', '#', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (int) (byte) 100, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '#', '#', ' ' });
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { ' ', '#', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (int) (byte) 1, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', '#', '#', 'a' });
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '4', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, 0, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) -1 });
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) '#', 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '#');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) 'a', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, 0, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100 });
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 1);
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
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 100, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 100, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 100, 100, 0 });
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '4', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (int) (short) 0, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 1 });
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) -1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) 'a');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) 'a');
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
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { 'a', '#', 'a', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, 0, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', '#', 'a', ' ', 'a' });
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, 0, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1, (byte) 10 });
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, (int) 'a', (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#' });
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { 'a', '#', 'a', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, 1, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', '#', 'a', ' ', 'a' });
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, 1, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0 });
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) (short) 1, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 100, (byte) -1 });
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) 'a', (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) -1 });
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { '#', '4', 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (int) '#', (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', 'a', '4' });
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 100, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 100 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 100 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] {});
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
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
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (-1), (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) -1 });
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) ' ');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 100, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 100, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 100, 100 });
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { 'a', 'a', '#', '4', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, 10, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a', 'a', '#', '4', '#', 'a' });
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (int) (short) 10, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0 });
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, 0, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a' });
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 10);
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
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) ' ');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 100);
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
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) ' ', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, 100, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 100, (byte) 1, (byte) 0 });
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '#');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) (byte) 100, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) -1, (byte) 100 });
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { '#', '4', '#', '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) ' ', reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) '4', (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '4', '#', '4', 'a' });
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, 100, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', 'a' });
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '4');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) '4');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (byte) 1);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (short) 0);
        int[] intArray22 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) ' ');
        java.lang.Class<?> wildcardClass23 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 100, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 100 });
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
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { 'a', '#', 'a', '#', '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (-1), reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) '4', 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a', '#', 'a', '#', '4', 'a' });
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) 'a', (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 100 });
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '4', ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) '#', (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', ' ', '4' });
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
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
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (short) -1);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (byte) 1);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (-1));
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
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) (short) 100, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 1 });
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, (int) (byte) -1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 10, (byte) 100, (byte) 10 });
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) '#', (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 100);
        java.lang.Class<?> wildcardClass13 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 100, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (int) (byte) 100, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10 });
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) 'a', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, (int) '#', (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) -1, (byte) 10, (byte) 0 });
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) ' ');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 100);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '#');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
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
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) (byte) 10, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', 'a' });
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '4', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) (byte) 100, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', ' ', 'a' });
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        int[] intArray2 = new int[] { '#', '4' };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 35, 52 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 52, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 52, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 35, 52 });
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        int[] intArray4 = new int[] { (byte) -1, 1, 100, 1 };
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) -1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) ' ');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 1, 100, 1 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 1, 100, 1, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { (-1), 1, 100 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { (-1), 1, 100, 0 });
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { 'a', 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) 'a', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', 'a', '#' });
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (int) (short) 0, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0 });
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { '4', ' ', 'a', '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) '4', (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', ' ', 'a', '4', '4' });
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 0);
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
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, 0, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 100 });
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (byte) 10, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { '#', 'a', 'a', '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, 0, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', 'a', 'a', '4', 'a' });
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, 0, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100 });
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) (short) 10, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '4' });
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, 1, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 10 });
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '4', '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) '#', reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, 0, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4', '#' });
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { '4', '#', '#', '#', 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) (byte) 1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '#', '#', '#', 'a', ' ' });
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        java.lang.Class<?> wildcardClass7 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '#');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) (byte) 1, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) -1, (byte) 100 });
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) -1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '#');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 1);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 10);
        int[] intArray22 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 10);
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
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) 'a');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 0);
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
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) '4');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) -1);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (short) 0);
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
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) -1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 10);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (byte) 0);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, 10);
        int[] intArray22 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, (int) (byte) 10);
        int[] intArray24 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray22, (int) 'a');
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
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (short) 100, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '#', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (-1), reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) (short) 0, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', '#', ' ' });
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '4', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (int) (byte) 1, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) -1 });
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) ' ', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (-1), (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, (int) (short) 1, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 100, (byte) 100, (byte) 100 });
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, 10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0 });
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) 10);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) ' ');
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (short) 1);
        int[] intArray22 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (byte) -1);
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
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { 'a', '4', ' ', '#', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, 1, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', '4', ' ', '#', '4' });
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) -1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) 'a');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) 'a');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) -1);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) -1);
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
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, (int) (short) 10, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 0, (byte) -1, (byte) 100 });
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '4');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 1);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (short) 0);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, 0);
        int[] intArray22 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray20, (int) '#');
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
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) '#', (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 10 });
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) ' ');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '#');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) (byte) -1, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) ' ', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, 10, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (int) (byte) 10, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100 });
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass5 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '4', '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, 100, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4', ' ' });
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 100, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 100, 100 });
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) 'a', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) (byte) 10, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '4');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 10);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) ' ');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 100, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) ' ');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) '4');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) '#');
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 100, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 100, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 100, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 100, 100, 0 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 0);
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
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 100);
        java.lang.Class<?> wildcardClass9 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, 0, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100 });
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) ' ', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) '4', (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { ' ', '4', 'a', '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, 100, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { ' ', '4', 'a', '4', '#' });
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { 'a', ' ', 'a', '#', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (-1), reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) (byte) 10, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a', ' ', 'a', '#', '#', '#' });
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) 'a');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) 'a', reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) (byte) 100, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', 'a' });
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { '#', '4', ' ', 'a', ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) '4', (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '4', ' ', 'a', ' ', ' ' });
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) ' ');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (-1));
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 0);
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
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '4');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '4');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) -1);
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
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, (-1), (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4' });
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (-1), reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, 0, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '#' });
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '4', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, 1, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 10);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '#');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) ' ');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) (byte) -1, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) -1, (byte) 1 });
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, (int) (byte) -1, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { ' ' });
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) ' ', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) (short) 100, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (-1), reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (-1), (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { 'a', '#', '#', '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (-1), reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) (byte) -1, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', '#', '#', '4', '#' });
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '4', '#', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) (short) 0, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '4' });
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) '#', 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 1, (byte) 0 });
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '4', 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) ' ', reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) 'a', 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', 'a', '#' });
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 100);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (short) 100);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) -1);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 0);
        int[] intArray22 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray20, (int) (byte) -1);
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
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 100, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 100, 100, 0 });
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) ' ', 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) 'a', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, 0, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 0, (byte) 10 });
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 0);
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
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '#', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) (byte) 10, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', ' ', 'a' });
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, (int) '4', (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) -1 });
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 10);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '4');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { 'a', '#', '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (int) (byte) 1, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', '4', '4' });
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '4');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 1);
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
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, (int) '4', 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 1 });
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 10);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) 'a');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) 'a', (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 0, (byte) 10 });
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (short) -1, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, (int) (byte) 10, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) 0, (byte) 10 });
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '4');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 1);
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
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (-1), (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) ' ');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '#');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '#');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 1);
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
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, (int) (byte) -1, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a' });
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) (short) -1, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) ' ');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '#');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) ' ');
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
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 0);
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
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '4');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '4');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) -1);
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
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '#', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) '4', (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, (int) '4', (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a' });
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) 'a', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (int) 'a', (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 10 });
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, 100, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 0, (byte) 100 });
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '4');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) -1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 10);
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
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) ' ', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) (short) -1, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 100, (byte) 1 });
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (int) (byte) 100, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) -1 });
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '4', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) (byte) 100, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100 });
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 1);
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
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, (int) 'a', (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 0 });
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) -1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 0);
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
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) (short) 10, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) -1 });
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '#');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (-1));
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
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 100, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 100, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) ' ');
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '#', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, 1, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '4' });
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) (byte) 100, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 100, (byte) 10 });
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { ' ', 'a', 'a', '#', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (-1), 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { ' ', 'a', 'a', '#', '#', ' ' });
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (-1), (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', 'a' });
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { '4', '4', '#', ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (-1), reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) '#', (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4', '#', ' ', ' ' });
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 10);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
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
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) '4', (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, 0, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a' });
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) -1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 10);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, 1);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (byte) 100);
        int[] intArray22 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) '4');
        int[] intArray24 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) ' ');
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
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { 'a', '4', 'a', '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) (short) 0, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', '4', 'a', '4', 'a' });
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
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
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '4');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 10);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 1);
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
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (-1), (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) '4', reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) (short) -1, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', 'a' });
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '4');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) 'a');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 100);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, 1);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, 0);
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
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { '4', ' ', ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) ' ', reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (int) (byte) 0, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', ' ', ' ', '#' });
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) (byte) 100, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) 10 });
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) -1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 10);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 10);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 1);
        int[] intArray22 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray20, (int) (byte) 100);
        int[] intArray24 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray20, (int) (byte) 0);
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
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 100);
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
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) (short) 10, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 100, (byte) -1 });
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '4', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) 'a', reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, 0, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '#' });
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) -1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, 0, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#' });
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) '#', (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (-1), 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, 0, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100 });
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        int[] intArray4 = new int[] { (byte) -1, 1, 100, 1 };
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 1, 100, 1 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 1, 100, 1, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { (-1), 1, 100, 1, 0, 0 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { (-1), 1, 100, 1, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 10);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 10);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, 1);
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
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { 'a', 'a', '#', '#', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, 100, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', '#', '#', '4' });
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) (byte) 1, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) -1 });
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (short) -1);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (short) 1);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, (-1));
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
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, 10, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 10, (byte) 0, (byte) 10 });
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] {});
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] {});
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '#');
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (int) (byte) 1, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1 });
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (short) -1);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) 100);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (short) 100);
        int[] intArray22 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray20, (int) (short) 1);
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
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) -1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 10);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 10);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, (int) 'a');
        int[] intArray22 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray20, (int) (short) 10);
        int[] intArray24 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray22, (int) (short) 1);
        int[] intArray26 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray24, (int) '4');
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
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, 0, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 10, (byte) 10 });
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) (short) 0, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100 });
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) ' ');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '#', ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) (short) 100, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', ' ', ' ' });
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) 'a');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) ' ');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 100, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, 0, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '4');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '4');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 0);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 1);
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
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) (byte) -1, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 100, (byte) 10 });
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) (byte) 0, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) ' ');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 0);
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
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { ' ', 'a', ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (-1), reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (int) (byte) -1, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', 'a', ' ', '#' });
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) '4', reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, (int) (byte) 1, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a' });
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 10);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 1);
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) ' ', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) 'a', 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 1, (byte) 1 });
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { 'a', 'a', ' ', ' ', 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (-1), reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) ' ', (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a', 'a', ' ', ' ', 'a', '4' });
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, 1, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 1 });
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 0);
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
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) (byte) 100, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 10, (byte) 100 });
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '4', ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (-1), reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, 100, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', ' ', '4' });
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) 'a', (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 100, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 100);
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
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (-1), (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100 });
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 10);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) -1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, 1, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) '4', reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) (byte) 10, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', 'a' });
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { ' ', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, 100, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { ' ', '#', '#' });
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 10);
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
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, 10, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', ' ' });
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { '4', ' ', ' ', '#', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) (byte) 0, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', ' ', '#', '#', 'a' });
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '4', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) (byte) 0, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', 'a' });
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) 'a');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 1);
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
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, 10, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '4');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) '4');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (byte) 1);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 100, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 100 });
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
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) (byte) 0, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) (short) 0, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', 'a' });
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (short) 10, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { ' ', ' ', 'a', ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, 0, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { ' ', ' ', 'a', ' ', '4' });
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '4');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) 'a');
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
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) (byte) -1, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 1, (byte) 100 });
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, (-1), (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 0 });
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { ' ', 'a', 'a', '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) '4', 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { ' ', 'a', 'a', '4', 'a' });
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) (byte) -1, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', 'a' });
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass7 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 1);
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
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { ' ', '4', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (int) (byte) -1, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', '4', '#', 'a' });
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '4', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) ' ', (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 1, (byte) 10 });
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) '4', (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 10);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) -1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) 'a');
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
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (short) 1, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) '4', reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, 1, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#' });
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '4');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (int) (byte) 100, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1 });
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, 1, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 100, (byte) 0 });
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '4');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 1);
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
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { ' ', 'a', '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) ' ', reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, 100, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', 'a', '4', ' ' });
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) '#', 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 100);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, 1);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 100, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 100, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 100, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 100, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 100, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 100, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) ' ');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 100);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '#');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (byte) 0);
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
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) 'a', (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 0, (byte) 100 });
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, (int) (short) 1, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4' });
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) '4', reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) 'a', (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', 'a' });
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) ' ', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) (byte) 10, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 100, (byte) 100 });
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (int) (byte) 0, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) -1 });
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, 1, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) -1 });
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 100);
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
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { '#', ' ', 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, 0, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', ' ', 'a', '#' });
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (-1));
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, 10, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '#', '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) (byte) 1, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', '4', '4' });
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) -1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (int) (byte) 0, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) -1 });
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, 0, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 0 });
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) (short) 10, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, 1, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { '#', ' ', 'a', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) 'a', reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, 10, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', ' ', 'a', '#', '#' });
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) ' ', reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (short) 0, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) 'a');
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
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { '4', '4', '#', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) '#', reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (int) (short) 0, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', '#', '4' });
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 100);
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
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) -1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 10);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (byte) 0);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, 10);
        int[] intArray22 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, (int) (byte) 10);
        int[] intArray24 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray22, (int) 'a');
        int[] intArray26 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray24, 100);
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
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (int) (short) 1, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10 });
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { '4', 'a', ' ', '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (-1), 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', 'a', ' ', '4', '#' });
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) ' ', reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, 1, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a' });
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '4');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 10);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) ' ');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (byte) 1);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 100, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, (int) (byte) 0, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a' });
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { ' ', ' ', 'a', '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) 'a', reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) (short) 0, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { ' ', ' ', 'a', '4', 'a' });
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { 'a', 'a', 'a', '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) 'a', reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, 1, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', 'a', '4', '4' });
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) 'a', (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) -1, (byte) -1 });
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '4');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) -1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 1);
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
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
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
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) 'a', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) (short) -1, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 0 });
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 10);
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
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) (byte) 100, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) -1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '#');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (byte) 0);
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
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, (int) (short) 1, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) 0 });
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) (short) -1, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 0, (byte) 0 });
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { 'a', '#', '4', '4', '#', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) (byte) 1, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a', '#', '4', '4', '#', '4' });
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { '#', '#', '#', 'a', ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) 'a', reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) (short) 1, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '#', '#', 'a', ' ', ' ' });
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) '#', 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) ' ');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 100);
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
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '4', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (-1), (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 0 });
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { '4', '#', ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (int) 'a', (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '#', ' ', ' ' });
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) '4', reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (byte) 0, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) -1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '#');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 100);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 0);
        int[] intArray22 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 10);
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
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) 'a');
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
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 10);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 1);
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
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) '4');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) '4');
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
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { '#', '4', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) 'a', reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (int) 'a', 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#', '#' });
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (int) ' ', (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 });
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, 0, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 10 });
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) -1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) ' ');
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
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, 0, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '#' });
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (short) -1, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, 0, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 0, (byte) 10 });
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '4', '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) (short) 1, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4', ' ' });
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '#', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) (byte) -1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', '4' });
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { ' ', '4', ' ', 'a', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) (short) 0, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { ' ', '4', ' ', 'a', '#', ' ' });
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (short) -1);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) 100);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (short) 100);
        int[] intArray22 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray20, (int) (byte) 1);
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
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) -1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 10);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 10);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, (int) 'a');
        int[] intArray22 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, (int) (byte) -1);
        int[] intArray24 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, (int) (short) -1);
        int[] intArray26 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, (int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = intArray26.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) (byte) 1, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 10 });
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { '#', '#', '#', ' ', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, 0, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '#', '#', ' ', ' ', 'a' });
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (int) 'a', (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100 });
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { '4', '4', 'a', 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, 0, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4', 'a', 'a', ' ' });
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
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
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) ' ');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 100);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '#');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) '#');
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
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, 0, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (byte) 0, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) '#', (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) -1, (byte) -1 });
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (int) (short) 1, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1 });
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, 0, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '#' });
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (short) 1, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { ' ', ' ', '#', ' ', '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) '#', (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { ' ', ' ', '#', ' ', '4', '4' });
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (short) 10, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (int) '#', (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1 });
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) '4', reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, (int) (short) 0, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4' });
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '#');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 1);
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
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '#', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (int) (short) 100, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1 });
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { 'a', ' ', ' ', ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) (short) -1, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', ' ', ' ', ' ', ' ' });
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '4');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) '#');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (short) 1);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 100, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 10);
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 100);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 100, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { 'a', '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) 'a', reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) (byte) -1, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', '4', 'a' });
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        int[] intArray2 = new int[] { '#', '4' };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '4');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '#');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 35, 52 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 52, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 35, 52, 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 35, 52, 0 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (int) 'a', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10 });
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) (byte) -1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 100, (byte) 10 });
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (short) 100, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, (int) (byte) 0, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 0, (byte) -1, (byte) 0 });
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) ' ', reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, (-1), (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a' });
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (int) (byte) -1, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { ' ', 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) (short) 0, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { ' ', 'a', '4' });
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '4', 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) (byte) -1, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', 'a', '4' });
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, 0, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100 });
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) ' ', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) (byte) 0, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (int) ' ', (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) -1 });
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, 1, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10 });
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 0);
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
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (-1), reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) (byte) 100, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', ' ' });
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { 'a', 'a', '#', '4', '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, 100, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a', 'a', '#', '4', '4', 'a' });
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { 'a', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) (short) 0, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', 'a', 'a' });
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) ' ', (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass5 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 1);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { '#', 'a', ' ', 'a', 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) (short) 10, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', 'a', ' ', 'a', 'a', '#' });
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) (short) 100, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { '4', 'a', ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (int) (byte) 0, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', 'a', ' ', '#' });
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (byte) 1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '4');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 1);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 100, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (short) 100, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (short) -1);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (byte) 1);
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
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) 'a', 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 0 });
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { ' ', '#', 'a', 'a', ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) (byte) 1, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { ' ', '#', 'a', 'a', ' ', '4' });
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 100, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 100, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 100, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 100, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (short) -1);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) 100);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) 100);
        int[] intArray22 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray20, (int) '4');
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
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) (byte) 100, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '#', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, 100, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0 });
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '4');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) 'a');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) 100);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 100);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) -1);
        int[] intArray22 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (short) -1);
        int[] intArray24 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray22, 0);
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
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 0);
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
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, 100, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 1, (byte) 10 });
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) -1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
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
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { '#', ' ', '4', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) (byte) 100, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', ' ', '4', ' ', 'a' });
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { '#', 'a', 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (int) (short) 100, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', 'a', 'a', '#' });
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) 'a', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) (short) 10, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 0, (byte) 100 });
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, 1, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (byte) 100, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) (short) 100, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) -1, (byte) -1 });
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) -1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '#');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 100);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 0);
        int[] intArray22 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray20, 100);
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
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, (int) (short) -1, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 1, (byte) 100, (byte) -1 });
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 100);
        java.lang.Class<?> wildcardClass17 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 100, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) (byte) -1, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100 });
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, (int) (byte) -1, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10, (byte) 0, (byte) 0 });
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, (int) (byte) 100, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 1, (byte) 1, (byte) 0 });
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, 0, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 });
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
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
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 100);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) ' ');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (byte) 100);
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
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 100);
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
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) '#', reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, 0, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '#' });
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) '4', (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', ' ' });
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { 'a', '4', ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (int) '4', (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '4', ' ', ' ' });
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, 0, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { 'a', '#', ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (int) (short) 0, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', ' ', ' ' });
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 10);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '4', 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) (short) -1, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', 'a', '#' });
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (-1), 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) ' ');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) (byte) 100, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 0, (byte) -1 });
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '4', 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) 'a', reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) (short) 100, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', 'a', '#' });
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) 'a', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 0 });
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) (byte) 1, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10 });
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '4');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) '4');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) 'a');
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) 'a');
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 100, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 100 });
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
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
        int[] intArray2 = new int[] { '#', '4' };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) 'a');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 35, 52 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 52, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { '4', '4', ' ', ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) (byte) 1, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4', ' ', ' ', '4' });
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { 'a', ' ', '#', '#', ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) (byte) -1, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a', ' ', '#', '#', ' ', ' ' });
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, 0, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 100, (byte) 1 });
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, 1, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', ' ' });
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) -1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 10);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, 1);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, (int) (short) 1);
        int[] intArray22 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, (int) (byte) -1);
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
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 0);
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) ' ');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 100, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 100 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 100 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 100 });
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) '#', 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { ' ', ' ', 'a', '4', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) ' ', reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) '#', (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { ' ', ' ', 'a', '4', '#', 'a' });
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '4');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 100, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) ' ', reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, (-1), (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4' });
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { '4', '#', '4', ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) ' ', reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) '4', (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '#', '4', ' ', '#' });
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 100, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 100 });
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '#', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, 0, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '4');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) 'a');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) 100);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 100);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, (int) (byte) -1);
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
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 10);
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
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) (short) 0, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 10, (byte) 10 });
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '#', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) (byte) 100, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, (int) 'a', (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 0, (byte) 0 });
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { '#', 'a', 'a', '4', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (-1), 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', 'a', 'a', '4', '#', 'a' });
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { 'a', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) (short) 1, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', ' ', 'a' });
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) (short) 1, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', '#' });
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { '#', '4', '4', ' ', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) '#', reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) (byte) -1, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '4', '4', ' ', ' ', 'a' });
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (-1));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (int) (short) 0, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100 });
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) 1);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (byte) 100);
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
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, (int) 'a', (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 1, (byte) 100, (byte) 0 });
    }
}

