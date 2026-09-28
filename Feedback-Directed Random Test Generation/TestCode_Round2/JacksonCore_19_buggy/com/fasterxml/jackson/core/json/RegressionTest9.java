package com.fasterxml.jackson.core.json;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

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
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) (short) -1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) -1, (byte) 10 });
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { '4', '4', ' ', '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (-1), (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4', ' ', '4', ' ' });
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { ' ', '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, 0, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { ' ', '4', '4' });
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { '4', '#', '#', ' ', '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) (byte) 0, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '#', '#', ' ', '4', '4' });
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { 'a', 'a', ' ', ' ', ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) (byte) 0, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a', 'a', ' ', ' ', ' ', '#' });
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (byte) 1, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, 0, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) -1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) 'a');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 10);
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
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, (int) '4', (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1, (byte) 10, (byte) 100 });
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { '4', 'a', '4', 'a', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, 100, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', 'a', '4', 'a', '#', 'a' });
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '#', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) (short) -1, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 0 });
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { '#', '#', '#', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) (byte) 10, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '#', '#', ' ', 'a' });
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) 'a');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '4');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) 'a');
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
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = intArray12.getClass();
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
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 100 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) (short) 0, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, 0, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 10 });
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
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
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        int[] intArray2 = new int[] { '#', '4' };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '4');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '4');
        java.lang.Class<?> wildcardClass13 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 35, 52 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 52, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 35, 52, 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (int) (short) 10, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 100 });
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) ' ', (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 10, (byte) -1 });
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '4');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) '#');
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
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { 'a', '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) '4', reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) '4', (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', '4', ' ' });
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { '4', '4', '#', '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) (short) 100, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', '4', '#', '4', 'a' });
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { ' ', '#', '4', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) (short) 1, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { ' ', '#', '4', ' ', 'a' });
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (byte) 0, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) (byte) 0, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, 10, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) (byte) 10, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) -1, (byte) 100 });
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 100, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 100, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 100, 100, 0, 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 100, 100, 0, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { ' ', ' ', ' ', ' ', ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) (short) 0, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { ' ', ' ', ' ', ' ', ' ', '#' });
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) (byte) 0, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 10, (byte) 100 });
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 0);
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
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) ' ');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 100);
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
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '4');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (byte) 100, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 100);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) 'a');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 10);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, 0);
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
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '4');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) '#');
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
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) -1);
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
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 100, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '4');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '4', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, 1, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 1 });
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, 0, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { '4', ' ', '#', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (-1), (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', ' ', '#', '4' });
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (-1));
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 10);
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
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
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
        int[] intArray24 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray22, (int) (short) 10);
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
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (short) 10, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '4', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) (byte) 1, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) '4', reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (byte) 100, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '4');
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
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '4');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 0);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) 1);
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
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (int) ' ', 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0 });
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) (short) 1, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', ' ' });
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) ' ', (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { ' ', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (-1), reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (-1), (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { ' ', '#', '#' });
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { ' ', '#', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (int) ' ', 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', '#', 'a', 'a' });
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (int) '#', (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10 });
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) 'a', reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) ' ', (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, 0, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 100, (byte) 100 });
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (byte) 1, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) ' ');
        java.lang.Class<?> wildcardClass9 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, 0, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1 });
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) ' ');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (int) (byte) 1, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100 });
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, 0, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
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
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
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
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 10);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (short) 0);
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
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (-1), 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1 });
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) (byte) 1, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0 });
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, 10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) -1, (byte) -1 });
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass7 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) (byte) 1, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) -1, (byte) 10 });
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { 'a', 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) (short) 1, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', 'a', '#' });
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, 10, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10 });
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 10);
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
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) -1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) '4');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) 'a');
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, 0);
        int[] intArray22 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (byte) 10);
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
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) (byte) 1, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (int) (short) 0, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0 });
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { 'a', ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, 0, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', ' ', '#' });
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, 0, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) ' ');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (-1));
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) 'a');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) ' ');
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
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, 10, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 1, (byte) 10 });
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) '4');
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
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) ' ');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '#');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 10);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 0);
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
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (-1), reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) (byte) 1, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', ' ' });
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
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
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, 1);
        int[] intArray22 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, 10);
        java.lang.Class<?> wildcardClass23 = intArray16.getClass();
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
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 10);
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
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) ' ', (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, 100, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100, (byte) -1 });
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) 1);
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
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        int[] intArray2 = new int[] { '#', '4' };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '4');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '#');
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '#');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
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
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 10);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { ' ', '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) '#', (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { ' ', '4', '#' });
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { '#', 'a', ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (int) (short) 10, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', 'a', ' ', '4' });
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '4');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '4');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 1);
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
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 10);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, 10, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '#', '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) ' ', (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', '4', '4' });
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (int) (short) 10, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1 });
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, (int) (byte) 10, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4' });
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '4', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, 10, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, (int) '4', 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) 0 });
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, 0, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 100, (byte) -1 });
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 100);
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
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) (short) -1, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', 'a' });
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '4');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 1);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (short) 100);
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
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { ' ', '#', 'a', '#', ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) '#', reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) '4', (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { ' ', '#', 'a', '#', ' ', '#' });
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) ' ', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { ' ', '#', '4', 'a', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) ' ', reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (-1), (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { ' ', '#', '4', 'a', ' ', 'a' });
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
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
        int[] intArray24 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, (int) (byte) 10);
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
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) (short) -1, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 10 });
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) ' ', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, 0, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, 0, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1 });
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (byte) -1, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, (int) (short) 1, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#' });
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 10);
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
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) -1);
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
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { '#', '#', '4', '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, 0, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '#', '4', '4', 'a' });
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) ' ');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '#');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) -1);
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
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) ' ', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (int) (byte) 0, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1 });
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (int) 'a', (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10 });
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) -1);
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
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) (byte) -1, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, 10, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#' });
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
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
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, (int) ' ', 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) 1, (byte) 100 });
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 1);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, (int) ' ');
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
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, (int) (short) 1, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 100, (byte) 100 });
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
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
        int[] intArray22 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray20, (int) '4');
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
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '4', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) (byte) 1, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { '#', '#', '4', '#', '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) '4', reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) (short) 100, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '#', '4', '#', '4', '#' });
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '#', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) ' ', reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) (byte) 0, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', ' ', 'a' });
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, 0, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (int) ' ', (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0 });
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) (short) 1, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 0, (byte) -1 });
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { '4', ' ', ' ', 'a', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) '4', reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, 10, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', ' ', 'a', 'a', 'a' });
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 10);
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
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) 'a', (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, 0, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '4');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (short) 0);
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
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) -1);
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
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 10);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) ' ');
        java.lang.Class<?> wildcardClass7 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) '#', (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, (int) (short) 10, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 100, (byte) 100, (byte) -1 });
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) ' ', reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, 10, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (int) (byte) -1, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 10 });
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) 'a');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (-1));
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
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
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, 1, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) 100 });
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (int) (byte) 10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100 });
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { '4', 'a', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (-1), reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (int) '#', 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', 'a', 'a', 'a' });
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) '4');
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
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass9 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '#', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, (int) (short) -1, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 10, (byte) 0, (byte) 100 });
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 10);
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
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) ' ', reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, 0, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', ' ' });
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) 'a');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '#');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (int) (short) 0, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) -1 });
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) ' ');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 10);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 100);
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
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) (short) 100, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', '4' });
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) -1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 10);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 0);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) '4');
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, 0);
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
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) (byte) 10, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) ' ');
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
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) ' ');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (-1));
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
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
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 100 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) -1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 100);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) 'a');
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
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) 'a', (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (-1), reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, 0, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) '4', 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, (-1), (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 0, (byte) 1, (byte) -1 });
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) -1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 10);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, (int) (byte) 100, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#' });
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '4', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, 1, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', '#' });
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, 100, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) 1 });
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { 'a', 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) '#', reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) '4', (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', 'a', '4' });
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] {});
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { '#', '4', 'a', '4', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, 1, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '4', 'a', '4', '#', 'a' });
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) ' ');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '4', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) ' ', reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) (byte) 0, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', 'a', 'a' });
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 0);
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
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
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
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { ' ', '4', '4', '4', 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) (byte) 10, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { ' ', '4', '4', '4', 'a', ' ' });
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) (byte) 1, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 10 });
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, 10, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 1, (byte) 1 });
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) 'a', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, 10, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '#');
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
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 10);
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
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) -1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) ' ');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
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
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (int) '#', (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10 });
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (-1), 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 100, (byte) -1 });
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (byte) -1, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (short) -1);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (-1));
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) ' ');
        java.lang.Class<?> wildcardClass21 = intArray16.getClass();
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
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) '4', reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) (byte) 0, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#', ' ' });
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) (byte) 100, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) 1 });
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) 0);
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
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { '4', '#', 'a', '#', ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) (short) 10, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '#', 'a', '#', ' ', '#' });
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, 0, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) -1, (byte) -1 });
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '4');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 10);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) -1);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) 100);
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
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) -1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (-1));
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) 'a');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, 10);
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
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (int) (short) 0, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) -1 });
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 100, 100 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 100, 100, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 100, 100, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 100, 100, 0, 0 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { ' ', ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) ' ', (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { ' ', ' ', '#' });
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { 'a', '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, 0, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', '4', ' ' });
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (byte) -1);
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
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '4', '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) (short) 0, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4', '4' });
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '#', 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) ' ', reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, 10, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', 'a', ' ' });
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, 0, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 });
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) (byte) 0, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 10, (byte) 10 });
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 10);
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
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { ' ', '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (-1), reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) '4', (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { ' ', '4', 'a' });
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) -1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) (short) 1, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 1, (byte) 100 });
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) ' ');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) '#', reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) '#', (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) '#', (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser15 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray11, (int) '#', 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 0, (byte) 100, (byte) 100 });
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) '4');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) ' ');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) '4');
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
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, 100, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) 'a');
        java.lang.Class<?> wildcardClass9 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '4');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { 'a', '4', ' ', '#', '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, 10, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a', '4', ' ', '#', '4', '4' });
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 100);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (byte) 0);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (short) 100);
        int[] intArray22 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray20, (int) (short) 1);
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
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray22);
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) 'a', (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 1, (byte) 1 });
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) -1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) 'a');
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
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) '4', reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, 0, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, 100, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4' });
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) '#', reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (short) -1, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { '#', '#', ' ', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, 100, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '#', ' ', '#', '#' });
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (short) 100, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) (short) -1, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '#' });
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '4');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) ' ');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (-1));
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 10);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, (int) (short) 0);
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
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) '4');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
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
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) (short) 1, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 0, (byte) 0 });
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { '4', '4', '4', 'a', '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) '4', reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) (short) 10, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4', '4', 'a', '4', ' ' });
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '4', ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (-1), 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', ' ', '#' });
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { 'a', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) ' ', reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) (short) 10, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', '#', 'a' });
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (short) 100, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) 'a', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) (short) -1, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) ' ', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 1, (byte) 10 });
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) (short) 100, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', 'a' });
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 10);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 10);
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '#');
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
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) (short) -1, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 10 });
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '4');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 1);
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
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) (short) 0, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) 100 });
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { '#', '#', ' ', '#', ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) '#', (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '#', ' ', '#', ' ', ' ' });
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) (short) -1, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, 1, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { '#', ' ', ' ', '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) (byte) 0, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', ' ', ' ', '4', ' ' });
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) ' ', reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (-1), (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '#' });
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) ' ');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '#');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (-1));
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
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 0);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
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
        int[] intArray20 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray18, (int) (byte) 1);
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
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '4');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) '4');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 1);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (-1));
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) ' ');
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
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 100);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 100);
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
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, 10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) -1, (byte) 100 });
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (-1));
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) 'a');
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
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (-1), 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '#' });
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 10);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 0);
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
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 10);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) 'a');
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
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { 'a', 'a', '4', '#', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) (byte) 1, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', 'a', '4', '#', '4' });
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { '#', '#', '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (int) (byte) 0, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '#', '4', '4' });
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) (short) 100, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) -1 });
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '#', '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) (byte) 100, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', '4', '4' });
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 100);
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
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 0);
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
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (-1));
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 0);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (short) 10);
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
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { '4', 'a', '#', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, 1, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', 'a', '#', '4' });
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (-1), (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { ' ', '4', '4', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (-1), reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) (byte) 10, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { ' ', '4', '4', 'a', 'a' });
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 100);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 100);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, 100);
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
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) (byte) 1, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { '4', ' ', 'a', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) (short) 10, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', ' ', 'a', '#', '#' });
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (int) '4', 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 10 });
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, (int) (short) 1, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) '4', (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '4' });
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (int) (byte) 0, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1 });
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) '4', (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100 });
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 10);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) 'a');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 0);
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
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (-1), (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', 'a' });
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (int) '#', 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 1 });
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, 0, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 0 });
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) 0);
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
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray11 = new char[] { '#', '#', '4', ' ', '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser15 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray11, (int) (byte) 100, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '#', '4', ' ', '4', '4' });
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
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
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        int[] intArray4 = new int[] { (byte) -1, 1, 100, 1 };
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) -1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 1, 100, 1 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 1, 100, 1, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { (-1), 1, 100 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { (-1), 1, 100, 0 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { (-1), 1 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, 10);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 1);
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
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 100, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) (byte) -1, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 10, (byte) 10 });
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 100);
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
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 100);
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
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) (byte) 1, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) -1 });
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 0);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) 'a');
        java.lang.Class<?> wildcardClass9 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) ' ', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) '4', (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 10, (byte) 100 });
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '4');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (short) 100);
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
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray10 = new char[] { '#', '#', '#', '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser14 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 100, reader2, objectCodec3, charsToNameCanonicalizer4, charArray10, (int) '#', (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '#', '#', '4', '#' });
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 0);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) (short) 100);
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
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) 'a', (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', 'a' });
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        int[] intArray4 = new int[] { (byte) -1, 1, 100, 1 };
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) -1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1), 1, 100, 1 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 1, 100, 1, 0 });
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { (-1), 1, 100 });
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { (-1), 1, 100, 0 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { '#', ' ', 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) 'a', reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (int) (byte) 100, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', ' ', 'a', '4' });
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 1);
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
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { '#', 'a', '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (-1), reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, (int) (short) -1, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', 'a', '4', 'a' });
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) ' ');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '#');
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
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) 'a', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (int) '#', (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0 });
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 100);
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
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, (int) (short) -1, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '#' });
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, 1, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4' });
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser14 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 10, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray10, (int) (byte) 1, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 1, (byte) 100 });
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) 'a', (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100 });
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray6 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser10 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '#', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray6, (int) (byte) 100, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10 });
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (-1), reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, 100, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a' });
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '4', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (int) (byte) -1, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 0 });
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 100);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) -1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '4');
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
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser12 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray8, (int) (byte) 1, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 1, (byte) 100 });
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '#');
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '4');
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        int[] intArray2 = new int[] { '#', '4' };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (byte) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) 'a');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) 'a');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 35, 52 });
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 52, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser9 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) '#', inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray5, 10, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray7 = new char[] { 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser11 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) -1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray7, 100, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '#' });
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) '4');
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (-1));
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) 'a');
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
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) 'a', (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) 1);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 10);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (short) -1);
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
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray9 = new char[] { '#', ' ', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser13 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 1, reader2, objectCodec3, charsToNameCanonicalizer4, charArray9, 1, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', ' ', '#', '#' });
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (-1), inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (int) '4', (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) -1 });
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
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
        java.lang.Class<?> wildcardClass19 = intArray8.getClass();
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
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (short) 0);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) '#');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 10);
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) (byte) -1);
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) 'a');
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
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 100, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 100, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray8 = new char[] { '4', 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser12 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (byte) 10, reader2, objectCodec3, charsToNameCanonicalizer4, charArray8, (int) '#', (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', 'a', '4' });
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        int[] intArray2 = new int[] { (short) 100, (byte) 100 };
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 0);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) '#');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 0);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, (int) '4');
        int[] intArray16 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray14, (int) ' ');
        int[] intArray18 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray16, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = intArray16.getClass();
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
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray6 = new char[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser10 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, (int) (short) 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray6, 0, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a' });
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
        int[] intArray0 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) (short) 1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, 100);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray4, (int) (byte) -1);
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 0);
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
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) -1);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) -1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, 10);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) ' ');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '#');
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, 10);
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
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (short) 10);
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, 0);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) (byte) 100);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray6, (int) (byte) 0);
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser13 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (short) 0, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray9, (int) (short) -1, (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 1 });
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer4 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.UTF8StreamJsonParser uTF8StreamJsonParser11 = new com.fasterxml.jackson.core.json.UTF8StreamJsonParser(iOContext0, (int) (byte) 1, inputStream2, objectCodec3, byteQuadsCanonicalizer4, byteArray7, (int) (byte) -1, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100 });
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        java.io.Reader reader2 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer charsToNameCanonicalizer4 = null;
        char[] charArray5 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser readerBasedJsonParser9 = new com.fasterxml.jackson.core.json.ReaderBasedJsonParser(iOContext0, 0, reader2, objectCodec3, charsToNameCanonicalizer4, charArray5, (int) (short) -1, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        int[] intArray0 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icLatin1;
        int[] intArray2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 100);
        int[] intArray6 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, 1);
        int[] intArray8 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray2, (int) ' ');
        int[] intArray10 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray8, (int) '#');
        int[] intArray12 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray10, (int) (byte) 1);
        int[] intArray14 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.growArrayBy(intArray12, 1);
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
}

