package com.fasterxml.jackson.core.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        int int0 = com.fasterxml.jackson.core.util.TextBuffer.MAX_SEGMENT_LEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 262144 + "'", int0 == 262144);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        int int0 = com.fasterxml.jackson.core.util.TextBuffer.MIN_SEGMENT_LEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1000 + "'", int0 == 1000);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        // The following exception was thrown during execution in test generation
        try {
            double double2 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        char[] charArray0 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        java.lang.Class<?> wildcardClass1 = charArray0.getClass();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new char[] {});
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("hi!", (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray7 = textBuffer1.contentsAsArray();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -35 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray3 = textBuffer1.expandCurrentSegment((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.ensureNotShared();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 45 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        java.lang.Class<?> wildcardClass3 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", (int) (short) 100, 262144);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 100, end 262244, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray9 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        java.lang.Class<?> wildcardClass6 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray11 = textBuffer1.expandCurrentSegment((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        textBuffer5.releaseBuffers();
        char[] charArray7 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer5.resetWithShared(charArray7, (int) '#', (int) (byte) 10);
        textBuffer5.resetWithString("");
        char[] charArray13 = textBuffer5.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray13, 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 2 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        textBuffer6.setCurrentLength(1);
        boolean boolean9 = textBuffer6.hasTextAsCharacters();
        int int10 = textBuffer6.getTextOffset();
        char[] charArray11 = textBuffer6.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray11, (int) 'a', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 100 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal6 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        java.lang.Class<?> wildcardClass10 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal10 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        java.lang.String str5 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        char[] charArray8 = textBuffer7.getCurrentSegment();
        char[] charArray10 = textBuffer7.expandCurrentSegment((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray10, (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray4 = textBuffer1.expandCurrentSegment(3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", 0, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 999, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal9 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        int int7 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        char[] charArray10 = textBuffer9.getCurrentSegment();
        char[] charArray12 = textBuffer9.expandCurrentSegment((int) (byte) 1);
        char[] charArray13 = textBuffer9.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray13, (int) (byte) 10, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 45 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal4 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        textBuffer7.releaseBuffers();
        char[] charArray9 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer7.resetWithShared(charArray9, (int) '#', (int) (byte) 10);
        textBuffer7.resetWithString("");
        boolean boolean15 = textBuffer7.hasTextAsCharacters();
        int int16 = textBuffer7.size();
        char[] charArray17 = textBuffer7.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray17, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("hi!", (int) (short) 100, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 100, end 103, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        char[] charArray9 = textBuffer1.getTextBuffer();
        char[] charArray10 = textBuffer1.getCurrentSegment();
        java.lang.Class<?> wildcardClass11 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray11 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 100, end 100, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        textBuffer1.setCurrentLength((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray12 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("hi!", (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        int int7 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray8 = textBuffer1.contentsAsArray();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -35 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.setCurrentLength(262144);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = textBuffer1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 0, count 262144, length 1000");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.Class<?> wildcardClass2 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        char[] charArray7 = textBuffer1.contentsAsArray();
        char[] charArray8 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 100, end 200, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("hi!");
        java.lang.Class<?> wildcardClass5 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        int int3 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray5 = textBuffer1.expandCurrentSegment(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        int int7 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("hi!", 262144, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 45 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        textBuffer1.resetWithString("hi!");
        textBuffer1.releaseBuffers();
        textBuffer1.setCurrentLength(100);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal10 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"????????????????????????????????????????????????????????????????????????????????????????????????????\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithString("hi!");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        char[] charArray6 = textBuffer5.getCurrentSegment();
        char[] charArray8 = textBuffer5.expandCurrentSegment((int) (byte) 1);
        char[] charArray9 = textBuffer5.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray9, (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.contentsAsArray();
        java.lang.Class<?> wildcardClass7 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray6 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        textBuffer6.releaseBuffers();
        char[] charArray8 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer6.resetWithShared(charArray8, (int) '#', (int) (byte) 10);
        textBuffer6.resetWithString("");
        boolean boolean14 = textBuffer6.hasTextAsCharacters();
        int int15 = textBuffer6.size();
        char[] charArray16 = textBuffer6.getTextBuffer();
        textBuffer1.resetWithShared(charArray16, 10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal20 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 10, count 0, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        textBuffer1.setCurrentLength((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = textBuffer1.contentsAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        int int5 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal6 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        int int7 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        char[] charArray10 = textBuffer9.getCurrentSegment();
        textBuffer1.resetWithShared(charArray10, 10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        textBuffer5.setCurrentLength(1);
        boolean boolean8 = textBuffer5.hasTextAsCharacters();
        int int9 = textBuffer5.getTextOffset();
        char[] charArray10 = textBuffer5.contentsAsArray();
        textBuffer1.resetWithShared(charArray10, (int) (byte) 1, (int) '#');
        int int14 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = textBuffer1.contentsAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 1, count 35, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray11 = textBuffer1.expandCurrentSegment((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        char[] charArray9 = textBuffer1.getTextBuffer();
        int int10 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray11 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        char[] charArray11 = textBuffer1.contentsAsArray();
        int int12 = textBuffer1.getCurrentSegmentSize();
        int int13 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        textBuffer15.setCurrentLength(1);
        char[] charArray18 = textBuffer15.getCurrentSegment();
        char[] charArray19 = textBuffer15.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray19, (int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 1 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.append(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal9 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \" \" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        textBuffer6.setCurrentLength(1);
        char[] charArray9 = textBuffer6.getCurrentSegment();
        char[] charArray10 = textBuffer6.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray10, (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 35 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        textBuffer12.releaseBuffers();
        char[] charArray14 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer12.resetWithShared(charArray14, (int) '#', (int) (byte) 10);
        textBuffer12.resetWithString("");
        boolean boolean20 = textBuffer12.hasTextAsCharacters();
        char[] charArray21 = textBuffer12.emptyAndGetCurrentSegment();
        textBuffer1.append(charArray21, (int) (short) 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal25 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"a?\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(charArray21);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        char[] charArray9 = textBuffer1.expandCurrentSegment(100);
        java.lang.Class<?> wildcardClass10 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray14 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("hi!");
        java.lang.String str5 = textBuffer1.toString();
        java.lang.String str6 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        char[] charArray9 = textBuffer8.getCurrentSegment();
        char[] charArray11 = textBuffer8.expandCurrentSegment((int) (byte) 1);
        textBuffer8.resetWithString("hi!");
        textBuffer8.releaseBuffers();
        char[] charArray15 = textBuffer8.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray15, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray15);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray6 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        char[] charArray11 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        int int13 = textBuffer1.getCurrentSegmentSize();
        java.lang.Class<?> wildcardClass14 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        java.lang.String str4 = textBuffer1.toString();
        textBuffer1.resetWithString("hi!");
        // The following exception was thrown during execution in test generation
        try {
            double double7 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray8 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("");
        int int8 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal9 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("");
        int int8 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray9 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.append('a');
        char[] charArray10 = textBuffer1.expandCurrentSegment((int) '4');
        java.lang.Class<?> wildcardClass11 = charArray10.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        int int3 = textBuffer1.getTextOffset();
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithEmpty();
        java.lang.String str6 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray8 = textBuffer1.expandCurrentSegment((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        java.lang.String str4 = textBuffer1.toString();
        textBuffer1.resetWithString("hi!");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        textBuffer8.setCurrentLength(1);
        boolean boolean11 = textBuffer8.hasTextAsCharacters();
        int int12 = textBuffer8.getCurrentSegmentSize();
        char[] charArray13 = textBuffer8.getCurrentSegment();
        textBuffer8.append('a');
        char[] charArray16 = textBuffer8.getTextBuffer();
        textBuffer8.setCurrentLength(1000);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        textBuffer20.releaseBuffers();
        char[] charArray22 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer20.resetWithShared(charArray22, (int) '#', (int) (byte) 10);
        textBuffer20.resetWithString("");
        boolean boolean28 = textBuffer20.hasTextAsCharacters();
        int int29 = textBuffer20.size();
        char[] charArray30 = textBuffer20.contentsAsArray();
        textBuffer8.resetWithShared(charArray30, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray30, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 42 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        int int7 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        char[] charArray10 = textBuffer9.getCurrentSegment();
        textBuffer1.resetWithShared(charArray10, 10, (int) (short) 0);
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        int int7 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        char[] charArray10 = textBuffer9.getCurrentSegment();
        textBuffer1.resetWithShared(charArray10, 10, (int) (short) 0);
        java.lang.Class<?> wildcardClass14 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        textBuffer1.setCurrentLength((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray13 = textBuffer1.expandCurrentSegment((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        textBuffer1.append(' ');
        java.lang.Class<?> wildcardClass6 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        char[] charArray9 = textBuffer1.contentsAsArray();
        int int10 = textBuffer1.getCurrentSegmentSize();
        java.lang.Class<?> wildcardClass11 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        textBuffer12.releaseBuffers();
        char[] charArray14 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer12.resetWithShared(charArray14, (int) '#', (int) (byte) 10);
        textBuffer12.resetWithString("");
        boolean boolean20 = textBuffer12.hasTextAsCharacters();
        char[] charArray21 = textBuffer12.emptyAndGetCurrentSegment();
        textBuffer1.append(charArray21, (int) (short) 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(" ", 97, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 97, end 107, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(charArray21);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        char[] charArray9 = textBuffer1.contentsAsArray();
        int int10 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.contentsAsArray();
        char[] charArray7 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal8 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        int int11 = textBuffer1.size();
        char[] charArray12 = textBuffer1.contentsAsArray();
        char[] charArray13 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        textBuffer15.setCurrentLength(1);
        boolean boolean18 = textBuffer15.hasTextAsCharacters();
        int int19 = textBuffer15.getCurrentSegmentSize();
        char[] charArray20 = textBuffer15.getTextBuffer();
        char[] charArray21 = textBuffer15.emptyAndGetCurrentSegment();
        char[] charArray22 = textBuffer15.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray22, 3, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 1003 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(charArray20);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        textBuffer11.setCurrentLength(1);
        char[] charArray14 = textBuffer11.getCurrentSegment();
        boolean boolean15 = textBuffer11.hasTextAsCharacters();
        textBuffer11.append('a');
        boolean boolean18 = textBuffer11.hasTextAsCharacters();
        char[] charArray19 = textBuffer11.getCurrentSegment();
        boolean boolean20 = textBuffer11.hasTextAsCharacters();
        int int21 = textBuffer11.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer23 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler22);
        textBuffer23.releaseBuffers();
        char[] charArray25 = textBuffer23.getCurrentSegment();
        textBuffer11.resetWithShared(charArray25, (int) 'a', 0);
        char[] charArray29 = textBuffer11.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray29, 1000, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 1035 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertNotNull(charArray29);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        java.lang.String str5 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        char[] charArray8 = textBuffer7.getCurrentSegment();
        char[] charArray9 = textBuffer7.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray9, (int) '4', 1);
        textBuffer1.resetWithString(" ");
        java.lang.String str15 = textBuffer1.toString();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " " + "'", str15, " ");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray4 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        char[] charArray9 = textBuffer1.getTextBuffer();
        char[] charArray10 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        // The following exception was thrown during execution in test generation
        try {
            double double13 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        textBuffer5.setCurrentLength(1);
        boolean boolean8 = textBuffer5.hasTextAsCharacters();
        int int9 = textBuffer5.getTextOffset();
        char[] charArray10 = textBuffer5.contentsAsArray();
        char[] charArray11 = textBuffer5.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray11, 97, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 194 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        textBuffer5.setCurrentLength(1);
        boolean boolean8 = textBuffer5.hasTextAsCharacters();
        int int9 = textBuffer5.getTextOffset();
        char[] charArray10 = textBuffer5.contentsAsArray();
        textBuffer1.resetWithShared(charArray10, (int) (byte) 1, (int) '#');
        int int14 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(" ", 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 36 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.size();
        char[] charArray3 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 97, end 96, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charArray3);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        char[] charArray6 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal7 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        textBuffer1.append(' ');
        java.lang.String str6 = textBuffer1.contentsAsString();
        java.lang.Class<?> wildcardClass7 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal5 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        int int12 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler13 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer14 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler13);
        textBuffer14.setCurrentLength(1);
        boolean boolean17 = textBuffer14.hasTextAsCharacters();
        int int18 = textBuffer14.getTextOffset();
        char[] charArray19 = textBuffer14.emptyAndGetCurrentSegment();
        textBuffer14.setCurrentLength(262144);
        textBuffer14.setCurrentLength((int) (short) 10);
        textBuffer14.releaseBuffers();
        char[] charArray26 = textBuffer14.expandCurrentSegment(100);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray26, 35, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray26);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        textBuffer1.setCurrentLength((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal9 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        char[] charArray9 = textBuffer1.getTextBuffer();
        char[] charArray10 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        textBuffer12.setCurrentLength(1);
        char[] charArray15 = textBuffer12.getCurrentSegment();
        boolean boolean16 = textBuffer12.hasTextAsCharacters();
        textBuffer12.append('a');
        char[] charArray19 = textBuffer12.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray19, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(charArray19);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        int int11 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        textBuffer13.releaseBuffers();
        char[] charArray15 = textBuffer13.getCurrentSegment();
        textBuffer1.resetWithShared(charArray15, (int) 'a', 0);
        boolean boolean19 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        int int7 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray8 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        textBuffer5.setCurrentLength(1);
        boolean boolean8 = textBuffer5.hasTextAsCharacters();
        int int9 = textBuffer5.getTextOffset();
        char[] charArray10 = textBuffer5.contentsAsArray();
        textBuffer1.resetWithShared(charArray10, (int) (byte) 1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray14 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("hi!");
        java.lang.String str5 = textBuffer1.toString();
        java.lang.String str6 = textBuffer1.contentsAsString();
        char[] charArray8 = textBuffer1.expandCurrentSegment((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal9 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        int int11 = textBuffer1.size();
        char[] charArray12 = textBuffer1.contentsAsArray();
        char[] charArray13 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("hi!", 35, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 35, end 135, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray13);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        char[] charArray7 = textBuffer1.contentsAsArray();
        int int8 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        textBuffer10.setCurrentLength(1);
        char[] charArray13 = textBuffer10.getCurrentSegment();
        char[] charArray14 = textBuffer10.contentsAsArray();
        int int15 = textBuffer10.getTextOffset();
        char[] charArray16 = textBuffer10.contentsAsArray();
        char[] charArray17 = textBuffer10.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray17, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        textBuffer7.setCurrentLength(1);
        char[] charArray10 = textBuffer7.getCurrentSegment();
        boolean boolean11 = textBuffer7.hasTextAsCharacters();
        char[] charArray12 = textBuffer7.getCurrentSegment();
        char[] charArray13 = textBuffer7.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray13, (int) (byte) 100, 10);
        int int17 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str18 = textBuffer1.contentsAsString();
        java.lang.Class<?> wildcardClass19 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str18, "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        int int7 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = textBuffer1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 35, count 10, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 10, end 110, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        int int7 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        char[] charArray10 = textBuffer9.getCurrentSegment();
        textBuffer1.resetWithShared(charArray10, 10, (int) (short) 0);
        char[] charArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray14, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        textBuffer10.setCurrentLength(1);
        boolean boolean13 = textBuffer10.hasTextAsCharacters();
        int int14 = textBuffer10.getTextOffset();
        char[] charArray15 = textBuffer10.emptyAndGetCurrentSegment();
        textBuffer10.setCurrentLength(262144);
        textBuffer10.setCurrentLength((int) (short) 10);
        textBuffer10.releaseBuffers();
        textBuffer10.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer23 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler22);
        textBuffer23.setCurrentLength(1);
        boolean boolean26 = textBuffer23.hasTextAsCharacters();
        int int27 = textBuffer23.getCurrentSegmentSize();
        char[] charArray28 = textBuffer23.getTextBuffer();
        char[] charArray29 = textBuffer23.emptyAndGetCurrentSegment();
        char[] charArray30 = textBuffer23.contentsAsArray();
        textBuffer10.resetWithShared(charArray30, (int) (short) 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray30, (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNull(charArray28);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        char[] charArray9 = textBuffer1.contentsAsArray();
        int int10 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(" ", (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (short) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        char[] charArray13 = textBuffer12.getCurrentSegment();
        char[] charArray15 = textBuffer12.expandCurrentSegment((int) (byte) 1);
        java.lang.String str16 = textBuffer12.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        char[] charArray19 = textBuffer18.getCurrentSegment();
        char[] charArray20 = textBuffer18.getCurrentSegment();
        textBuffer12.resetWithCopy(charArray20, (int) '4', 1);
        textBuffer1.resetWithShared(charArray20, (int) (byte) 100, (int) (short) 10);
        char[] charArray27 = textBuffer1.contentsAsArray();
        char[] charArray28 = textBuffer1.getCurrentSegment();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
        org.junit.Assert.assertNotNull(charArray28);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        textBuffer1.setCurrentLength(3);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        char[] charArray17 = textBuffer16.getCurrentSegment();
        char[] charArray19 = textBuffer16.expandCurrentSegment((int) (byte) 1);
        char[] charArray20 = textBuffer16.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray20, 0, 35);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray20);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("");
        int int8 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        textBuffer10.setCurrentLength(1);
        boolean boolean13 = textBuffer10.hasTextAsCharacters();
        int int14 = textBuffer10.getCurrentSegmentSize();
        char[] charArray15 = textBuffer10.getCurrentSegment();
        textBuffer10.append('a');
        char[] charArray18 = textBuffer10.getTextBuffer();
        textBuffer10.setCurrentLength(1000);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer22 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler21);
        textBuffer22.releaseBuffers();
        char[] charArray24 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer22.resetWithShared(charArray24, (int) '#', (int) (byte) 10);
        textBuffer22.resetWithString("");
        boolean boolean30 = textBuffer22.hasTextAsCharacters();
        int int31 = textBuffer22.size();
        char[] charArray32 = textBuffer22.contentsAsArray();
        textBuffer10.resetWithShared(charArray32, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray32, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] {});
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler13 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer14 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler13);
        char[] charArray15 = textBuffer14.getCurrentSegment();
        textBuffer14.resetWithString("hi!");
        java.lang.String str18 = textBuffer14.toString();
        java.lang.String str19 = textBuffer14.contentsAsString();
        char[] charArray20 = textBuffer14.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray20, (-1), 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { 'h', 'i', '!' });
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        char[] charArray5 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("hi!");
        java.lang.String str5 = textBuffer1.toString();
        java.lang.String str6 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        textBuffer8.releaseBuffers();
        textBuffer8.resetWithString("hi!");
        char[] charArray12 = textBuffer8.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray12, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(charArray12);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        textBuffer6.setCurrentLength(1);
        char[] charArray9 = textBuffer6.getCurrentSegment();
        char[] charArray10 = textBuffer6.contentsAsArray();
        char[] charArray11 = textBuffer6.getTextBuffer();
        textBuffer1.resetWithShared(charArray11, 100, (int) (byte) 0);
        textBuffer1.releaseBuffers();
        int int16 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        textBuffer18.releaseBuffers();
        char[] charArray20 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer18.resetWithShared(charArray20, (int) '#', (int) (byte) 10);
        textBuffer18.resetWithString("");
        boolean boolean26 = textBuffer18.hasTextAsCharacters();
        int int27 = textBuffer18.size();
        textBuffer18.releaseBuffers();
        int int29 = textBuffer18.getTextOffset();
        char[] charArray30 = textBuffer18.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray30, 3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 3 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("hi!");
        java.lang.String str5 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal6 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        int int11 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        textBuffer13.releaseBuffers();
        char[] charArray15 = textBuffer13.getCurrentSegment();
        textBuffer1.resetWithShared(charArray15, (int) 'a', 0);
        boolean boolean19 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 97, end 129, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        int int3 = textBuffer1.getTextOffset();
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal5 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        java.lang.String str5 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray6 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        int int7 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.releaseBuffers();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        java.lang.Class<?> wildcardClass10 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        textBuffer6.setCurrentLength(1);
        char[] charArray9 = textBuffer6.getCurrentSegment();
        char[] charArray10 = textBuffer6.contentsAsArray();
        char[] charArray11 = textBuffer6.getTextBuffer();
        textBuffer1.resetWithShared(charArray11, 100, (int) (byte) 0);
        textBuffer1.releaseBuffers();
        int int16 = textBuffer1.getCurrentSegmentSize();
        char[] charArray17 = textBuffer1.getCurrentSegment();
        textBuffer1.setCurrentLength(10);
        textBuffer1.resetWithString(" ");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer23 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler22);
        char[] charArray24 = textBuffer23.getCurrentSegment();
        char[] charArray26 = textBuffer23.expandCurrentSegment((int) (byte) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer28 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler27);
        textBuffer28.releaseBuffers();
        char[] charArray30 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer28.resetWithShared(charArray30, (int) '#', (int) (byte) 10);
        textBuffer28.resetWithString("");
        boolean boolean36 = textBuffer28.hasTextAsCharacters();
        int int37 = textBuffer28.size();
        char[] charArray38 = textBuffer28.getTextBuffer();
        textBuffer23.resetWithShared(charArray38, 10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray38, 1000, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 1035 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] {});
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        int int3 = textBuffer1.getTextOffset();
        java.lang.String str4 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000", (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        int int12 = textBuffer1.getTextOffset();
        char[] charArray13 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(" ", 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        textBuffer1.resetWithString("hi!");
        textBuffer1.releaseBuffers();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        char[] charArray11 = textBuffer10.getCurrentSegment();
        char[] charArray13 = textBuffer10.expandCurrentSegment((int) (byte) 1);
        java.lang.String str14 = textBuffer10.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        char[] charArray17 = textBuffer16.getCurrentSegment();
        char[] charArray18 = textBuffer16.getCurrentSegment();
        textBuffer10.resetWithCopy(charArray18, (int) '4', 1);
        textBuffer1.append(charArray18, (int) (short) 0, 3);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(" ", 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 100, end 200, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        char[] charArray9 = textBuffer1.contentsAsArray();
        int int10 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        textBuffer6.setCurrentLength(1);
        char[] charArray9 = textBuffer6.getCurrentSegment();
        char[] charArray10 = textBuffer6.contentsAsArray();
        char[] charArray11 = textBuffer6.getTextBuffer();
        textBuffer1.resetWithShared(charArray11, 100, (int) (byte) 0);
        textBuffer1.releaseBuffers();
        int int16 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray17 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        char[] charArray10 = textBuffer9.getCurrentSegment();
        char[] charArray12 = textBuffer9.expandCurrentSegment((int) (byte) 1);
        java.lang.String str13 = textBuffer9.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        char[] charArray16 = textBuffer15.getCurrentSegment();
        char[] charArray17 = textBuffer15.getCurrentSegment();
        textBuffer9.resetWithCopy(charArray17, (int) '4', 1);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray17, (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray17);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithString("hi!");
        java.lang.String str9 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal10 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"hi!\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        int int7 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = textBuffer1.contentsAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 35, count 10, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        textBuffer7.setCurrentLength(1);
        char[] charArray10 = textBuffer7.getCurrentSegment();
        boolean boolean11 = textBuffer7.hasTextAsCharacters();
        char[] charArray12 = textBuffer7.getCurrentSegment();
        char[] charArray13 = textBuffer7.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray13, (int) (byte) 100, 10);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("a", (int) 'a', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 97, end 132, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        char[] charArray11 = textBuffer1.getTextBuffer();
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithString("hi!");
        int int9 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.size();
        int int7 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal8 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        int int11 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        textBuffer13.releaseBuffers();
        char[] charArray15 = textBuffer13.getCurrentSegment();
        textBuffer1.resetWithShared(charArray15, (int) 'a', 0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        textBuffer20.releaseBuffers();
        char[] charArray22 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer20.resetWithShared(charArray22, (int) '#', (int) (byte) 10);
        textBuffer20.resetWithString("");
        boolean boolean28 = textBuffer20.hasTextAsCharacters();
        int int29 = textBuffer20.size();
        char[] charArray30 = textBuffer20.getTextBuffer();
        char[] charArray31 = textBuffer20.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray31, (int) (byte) -1, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] {});
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getTextBuffer();
        int int7 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray8 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        int int5 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(" ", (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 100, end 100, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        char[] charArray10 = textBuffer1.getTextBuffer();
        char[] charArray12 = textBuffer1.expandCurrentSegment((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal13 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"a\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray12);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        int int3 = textBuffer1.getTextOffset();
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithEmpty();
        java.lang.String str6 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        textBuffer8.releaseBuffers();
        char[] charArray10 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer8.resetWithShared(charArray10, (int) '#', (int) (byte) 10);
        textBuffer8.resetWithString("");
        boolean boolean16 = textBuffer8.hasTextAsCharacters();
        char[] charArray17 = textBuffer8.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray17, (int) (short) -1, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(charArray17);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        java.lang.String str5 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        textBuffer7.releaseBuffers();
        textBuffer7.resetWithString("hi!");
        textBuffer7.resetWithEmpty();
        char[] charArray12 = textBuffer7.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray12, 97, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 194 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        java.lang.String str4 = textBuffer1.toString();
        textBuffer1.resetWithString("hi!");
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.append('a');
        char[] charArray9 = textBuffer1.getTextBuffer();
        textBuffer1.setCurrentLength(1000);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        textBuffer13.releaseBuffers();
        char[] charArray15 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer13.resetWithShared(charArray15, (int) '#', (int) (byte) 10);
        textBuffer13.resetWithString("");
        boolean boolean21 = textBuffer13.hasTextAsCharacters();
        int int22 = textBuffer13.size();
        char[] charArray23 = textBuffer13.contentsAsArray();
        textBuffer1.resetWithShared(charArray23, 1, 0);
        java.lang.String str27 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double28 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("a", 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 0, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray7 = textBuffer1.expandCurrentSegment(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        textBuffer5.setCurrentLength(1);
        char[] charArray8 = textBuffer5.getCurrentSegment();
        boolean boolean9 = textBuffer5.hasTextAsCharacters();
        textBuffer5.append('a');
        boolean boolean12 = textBuffer5.hasTextAsCharacters();
        char[] charArray13 = textBuffer5.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray13, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(charArray13);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        int int11 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(" ", 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 100, end 99, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray8 = textBuffer1.expandCurrentSegment((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        int int3 = textBuffer1.getTextOffset();
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("a", 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        char[] charArray5 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        char[] charArray8 = textBuffer7.getCurrentSegment();
        char[] charArray10 = textBuffer7.expandCurrentSegment((int) (byte) 1);
        char[] charArray11 = textBuffer7.emptyAndGetCurrentSegment();
        boolean boolean12 = textBuffer7.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler13 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer14 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler13);
        textBuffer14.setCurrentLength(1);
        char[] charArray17 = textBuffer14.getCurrentSegment();
        char[] charArray18 = textBuffer14.contentsAsArray();
        int int19 = textBuffer14.getTextOffset();
        char[] charArray21 = textBuffer14.expandCurrentSegment((int) ' ');
        textBuffer7.append(charArray21, (int) (byte) 100, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray21, (int) (byte) -1, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray21);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        int int7 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray10 = textBuffer1.getCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 45 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.contentsAsArray();
        char[] charArray7 = textBuffer1.contentsAsArray();
        textBuffer1.setCurrentLength(10);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray10 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        java.lang.String str5 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        char[] charArray8 = textBuffer7.getCurrentSegment();
        char[] charArray9 = textBuffer7.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray9, (int) '4', 1);
        textBuffer1.resetWithString(" ");
        textBuffer1.setCurrentLength(97);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal17 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"?????????????????????????????????????????????????????????????????????????????????????????????????\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        textBuffer11.setCurrentLength(1);
        char[] charArray14 = textBuffer11.getCurrentSegment();
        boolean boolean15 = textBuffer11.hasTextAsCharacters();
        textBuffer11.append('a');
        char[] charArray18 = textBuffer11.emptyAndGetCurrentSegment();
        char[] charArray19 = textBuffer11.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray19, (int) (short) 0, (int) (short) 0);
        char[] charArray23 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray23, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 101 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        textBuffer5.setCurrentLength(1);
        boolean boolean8 = textBuffer5.hasTextAsCharacters();
        int int9 = textBuffer5.getTextOffset();
        char[] charArray10 = textBuffer5.contentsAsArray();
        textBuffer1.resetWithShared(charArray10, (int) (byte) 1, (int) '#');
        int int14 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 36 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        java.lang.String str4 = textBuffer1.toString();
        textBuffer1.resetWithString("hi!");
        int int7 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        textBuffer10.setCurrentLength(1);
        char[] charArray13 = textBuffer10.getCurrentSegment();
        char[] charArray14 = textBuffer10.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray14, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 10 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal5 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        int int7 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = textBuffer1.contentsAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 35, count 10, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        char[] charArray11 = textBuffer1.contentsAsArray();
        int int12 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString(" ");
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(" ", (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -1, end -1, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.Class<?> wildcardClass9 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        java.lang.String str10 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(" ", 10, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithString("hi!");
        int int9 = textBuffer1.getTextOffset();
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        char[] charArray9 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray10 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        textBuffer1.setCurrentLength(3);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.append('a');
        char[] charArray9 = textBuffer1.getTextBuffer();
        textBuffer1.setCurrentLength(1000);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        textBuffer13.releaseBuffers();
        char[] charArray15 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer13.resetWithShared(charArray15, (int) '#', (int) (byte) 10);
        textBuffer13.resetWithString("");
        boolean boolean21 = textBuffer13.hasTextAsCharacters();
        int int22 = textBuffer13.size();
        char[] charArray23 = textBuffer13.contentsAsArray();
        textBuffer1.resetWithShared(charArray23, 1, 0);
        java.lang.String str27 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler28 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer29 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler28);
        textBuffer29.setCurrentLength(1);
        char[] charArray32 = textBuffer29.getCurrentSegment();
        char[] charArray33 = textBuffer29.contentsAsArray();
        char[] charArray34 = textBuffer29.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray34, 35, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 45 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] {});
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] {});
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        textBuffer1.setCurrentLength(97);
        textBuffer1.releaseBuffers();
        int int16 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        // The following exception was thrown during execution in test generation
        try {
            double double8 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        java.lang.String str9 = textBuffer1.toString();
        java.lang.String str10 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        textBuffer12.releaseBuffers();
        char[] charArray14 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer12.resetWithShared(charArray14, (int) '#', (int) (byte) 10);
        textBuffer12.resetWithString("");
        boolean boolean20 = textBuffer12.hasTextAsCharacters();
        int int21 = textBuffer12.size();
        char[] charArray22 = textBuffer12.contentsAsArray();
        char[] charArray23 = textBuffer12.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray23, 97, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 107 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        textBuffer1.resetWithString("hi!");
        textBuffer1.releaseBuffers();
        int int8 = textBuffer1.size();
        textBuffer1.append('#');
        // The following exception was thrown during execution in test generation
        try {
            double double11 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        java.lang.String str10 = textBuffer1.toString();
        int int11 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        textBuffer13.setCurrentLength(1);
        char[] charArray16 = textBuffer13.getCurrentSegment();
        char[] charArray17 = textBuffer13.contentsAsArray();
        int int18 = textBuffer13.getTextOffset();
        char[] charArray19 = textBuffer13.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray19, (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(charArray19);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.append(' ');
        char[] charArray9 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray10 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray10, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 52 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        textBuffer1.append(' ');
        java.lang.String str6 = textBuffer1.contentsAsString();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(" ", (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 32, end 132, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertNotNull(charArray7);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray9 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        java.lang.String str4 = textBuffer1.toString();
        textBuffer1.resetWithString("hi!");
        int int7 = textBuffer1.size();
        java.lang.Class<?> wildcardClass8 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        textBuffer1.resetWithString("hi!");
        textBuffer1.releaseBuffers();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        char[] charArray11 = textBuffer10.getCurrentSegment();
        char[] charArray13 = textBuffer10.expandCurrentSegment((int) (byte) 1);
        java.lang.String str14 = textBuffer10.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        char[] charArray17 = textBuffer16.getCurrentSegment();
        char[] charArray18 = textBuffer16.getCurrentSegment();
        textBuffer10.resetWithCopy(charArray18, (int) '4', 1);
        textBuffer1.append(charArray18, (int) (short) 0, 3);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000", (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 52, end 152, length 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        textBuffer1.setCurrentLength(97);
        textBuffer1.resetWithEmpty();
        char[] charArray16 = textBuffer1.getCurrentSegment();
        java.lang.Class<?> wildcardClass17 = charArray16.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        java.lang.Class<?> wildcardClass5 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        textBuffer1.setCurrentLength(3);
        int int15 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("a", 3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        int int3 = textBuffer1.getTextOffset();
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithEmpty();
        java.lang.String str6 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        char[] charArray10 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal11 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        int int11 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray13 = textBuffer1.expandCurrentSegment(35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        java.lang.String str6 = textBuffer1.contentsAsString();
        java.lang.Class<?> wildcardClass7 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        textBuffer8.setCurrentLength(1);
        boolean boolean11 = textBuffer8.hasTextAsCharacters();
        int int12 = textBuffer8.getCurrentSegmentSize();
        char[] charArray13 = textBuffer8.getTextBuffer();
        char[] charArray14 = textBuffer8.emptyAndGetCurrentSegment();
        char[] charArray20 = new char[] { 'a', '#', ' ', '#', '#' };
        textBuffer8.resetWithShared(charArray20, 1000, 262144);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray20, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 100 out of bounds for char[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(charArray13);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { 'a', '#', ' ', '#', '#' });
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getTextBuffer();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray13 = new char[] { 'a', '#', ' ', '#', '#' };
        textBuffer1.resetWithShared(charArray13, 1000, 262144);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        textBuffer18.setCurrentLength(1);
        char[] charArray21 = textBuffer18.getCurrentSegment();
        char[] charArray22 = textBuffer18.contentsAsArray();
        int int23 = textBuffer18.getTextOffset();
        int int24 = textBuffer18.getCurrentSegmentSize();
        textBuffer18.resetWithEmpty();
        char[] charArray26 = textBuffer18.emptyAndGetCurrentSegment();
        char[] charArray27 = textBuffer18.emptyAndGetCurrentSegment();
        textBuffer1.resetWithCopy(charArray27, (int) (byte) 100, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal31 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"???????????????????????????????????\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { 'a', '#', ' ', '#', '#' });
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertNotNull(charArray27);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        textBuffer5.setCurrentLength(1);
        boolean boolean8 = textBuffer5.hasTextAsCharacters();
        int int9 = textBuffer5.getTextOffset();
        char[] charArray10 = textBuffer5.contentsAsArray();
        textBuffer1.resetWithShared(charArray10, (int) (byte) 1, (int) '#');
        int int14 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray16 = textBuffer1.expandCurrentSegment(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        char[] charArray5 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        int int12 = textBuffer1.getTextOffset();
        textBuffer1.setCurrentLength((int) (byte) 100);
        char[] charArray15 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer17 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler16);
        textBuffer17.releaseBuffers();
        char[] charArray19 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer17.resetWithShared(charArray19, (int) '#', (int) (byte) 10);
        textBuffer17.resetWithString("");
        char[] charArray25 = textBuffer17.getTextBuffer();
        char[] charArray26 = textBuffer17.getCurrentSegment();
        boolean boolean27 = textBuffer17.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler28 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer29 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler28);
        char[] charArray30 = textBuffer29.getCurrentSegment();
        char[] charArray31 = textBuffer29.getCurrentSegment();
        textBuffer29.append(' ');
        java.lang.String str34 = textBuffer29.contentsAsString();
        char[] charArray35 = textBuffer29.emptyAndGetCurrentSegment();
        textBuffer17.resetWithShared(charArray35, (int) (short) 1, (int) (byte) 10);
        textBuffer1.append(charArray35, 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass42 = charArray35.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] {});
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + " " + "'", str34, " ");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        java.lang.String str5 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        char[] charArray8 = textBuffer7.getCurrentSegment();
        char[] charArray9 = textBuffer7.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray9, (int) '4', 1);
        textBuffer1.resetWithString(" ");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        char[] charArray17 = textBuffer16.getCurrentSegment();
        char[] charArray19 = textBuffer16.expandCurrentSegment((int) (byte) 1);
        char[] charArray20 = textBuffer16.emptyAndGetCurrentSegment();
        boolean boolean21 = textBuffer16.hasTextAsCharacters();
        textBuffer16.releaseBuffers();
        char[] charArray24 = textBuffer16.expandCurrentSegment(100);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray24, (int) '4', 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 1052 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(charArray24);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        int int7 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal8 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        textBuffer1.append("hi!", 0, 0);
        java.lang.String str12 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("a", 3, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 3, end 4, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.append('a');
        char[] charArray9 = textBuffer1.getTextBuffer();
        char[] charArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray10, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        char[] charArray9 = textBuffer1.contentsAsArray();
        textBuffer1.setCurrentLength(100);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray12 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        char[] charArray12 = textBuffer11.getCurrentSegment();
        char[] charArray14 = textBuffer11.expandCurrentSegment((int) (byte) 1);
        char[] charArray15 = textBuffer11.emptyAndGetCurrentSegment();
        boolean boolean16 = textBuffer11.hasTextAsCharacters();
        textBuffer11.releaseBuffers();
        char[] charArray19 = textBuffer11.expandCurrentSegment(100);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray19, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(charArray19);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithString("hi!");
        java.lang.String str9 = textBuffer1.toString();
        java.lang.String str10 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal11 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        int int11 = textBuffer1.size();
        char[] charArray12 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler13 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer14 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler13);
        textBuffer14.setCurrentLength(1);
        char[] charArray17 = textBuffer14.getCurrentSegment();
        char[] charArray18 = textBuffer14.contentsAsArray();
        char[] charArray19 = textBuffer14.getTextBuffer();
        textBuffer1.resetWithShared(charArray19, 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.ensureNotShared();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 52 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        char[] charArray9 = textBuffer1.getTextBuffer();
        char[] charArray10 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithString("");
        // The following exception was thrown during execution in test generation
        try {
            double double14 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        textBuffer1.setCurrentLength(3);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        char[] charArray17 = textBuffer16.getCurrentSegment();
        char[] charArray19 = textBuffer16.expandCurrentSegment((int) (byte) 1);
        char[] charArray20 = textBuffer16.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray20, 0, 35);
        int int24 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal25 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"???????????????????????????????????\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        char[] charArray9 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray11 = textBuffer1.expandCurrentSegment((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        char[] charArray11 = textBuffer1.contentsAsArray();
        java.lang.Class<?> wildcardClass12 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        textBuffer1.append(' ');
        java.lang.String str6 = textBuffer1.contentsAsString();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("a", (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 52, end 104, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertNotNull(charArray7);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        java.lang.String str6 = textBuffer1.contentsAsString();
        textBuffer1.append('a');
        java.lang.Class<?> wildcardClass9 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.size();
        char[] charArray3 = textBuffer1.getTextBuffer();
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray5 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charArray3);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        int int10 = textBuffer1.size();
        java.lang.String str11 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        textBuffer13.releaseBuffers();
        char[] charArray15 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer13.resetWithShared(charArray15, (int) '#', (int) (byte) 10);
        textBuffer13.resetWithString("");
        char[] charArray21 = textBuffer13.getTextBuffer();
        char[] charArray22 = textBuffer13.getCurrentSegment();
        boolean boolean23 = textBuffer13.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler24 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer25 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler24);
        char[] charArray26 = textBuffer25.getCurrentSegment();
        char[] charArray27 = textBuffer25.getCurrentSegment();
        textBuffer25.append(' ');
        java.lang.String str30 = textBuffer25.contentsAsString();
        char[] charArray31 = textBuffer25.emptyAndGetCurrentSegment();
        textBuffer13.resetWithShared(charArray31, (int) (short) 1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray31, 262144, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 262241 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "a" + "'", str11, "a");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] {});
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + " " + "'", str30, " ");
        org.junit.Assert.assertNotNull(charArray31);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        textBuffer1.append(' ');
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        textBuffer8.setCurrentLength(1);
        boolean boolean11 = textBuffer8.hasTextAsCharacters();
        int int12 = textBuffer8.getTextOffset();
        char[] charArray13 = textBuffer8.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray13, (-1), 35);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        char[] charArray19 = textBuffer18.getCurrentSegment();
        textBuffer18.resetWithString("hi!");
        java.lang.String str22 = textBuffer18.toString();
        textBuffer18.append('#');
        char[] charArray25 = textBuffer18.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray25, (int) '#', 3);
        textBuffer1.append(' ');
        java.lang.Class<?> wildcardClass31 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        char[] charArray11 = textBuffer1.contentsAsArray();
        char[] charArray12 = textBuffer1.contentsAsArray();
        int int13 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        char[] charArray16 = textBuffer15.getCurrentSegment();
        char[] charArray17 = textBuffer15.getCurrentSegment();
        textBuffer15.append(' ');
        java.lang.String str20 = textBuffer15.contentsAsString();
        char[] charArray21 = textBuffer15.emptyAndGetCurrentSegment();
        char[] charArray22 = textBuffer15.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray22, (-1), 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " " + "'", str20, " ");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray22);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        textBuffer1.setCurrentLength(3);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        char[] charArray17 = textBuffer16.getCurrentSegment();
        char[] charArray19 = textBuffer16.expandCurrentSegment((int) (byte) 1);
        char[] charArray20 = textBuffer16.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray20, 0, 35);
        textBuffer1.setCurrentLength((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal26 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"???????????????????????????????????\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray20);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        textBuffer1.append(' ');
        java.lang.String str6 = textBuffer1.contentsAsString();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000", 35, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 35, end 87, length 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        textBuffer6.setCurrentLength(1);
        char[] charArray9 = textBuffer6.getCurrentSegment();
        char[] charArray10 = textBuffer6.contentsAsArray();
        char[] charArray11 = textBuffer6.getTextBuffer();
        textBuffer1.resetWithShared(charArray11, 100, (int) (byte) 0);
        textBuffer1.releaseBuffers();
        int int16 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("hi!", 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        char[] charArray9 = textBuffer1.contentsAsArray();
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal11 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithString("");
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("4", (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.append('a');
        char[] charArray10 = textBuffer1.expandCurrentSegment((int) '4');
        int int11 = textBuffer1.getCurrentSegmentSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        char[] charArray9 = textBuffer1.getTextBuffer();
        int int10 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        char[] charArray5 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray6 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        textBuffer1.append(' ');
        java.lang.String str6 = textBuffer1.contentsAsString();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        textBuffer1.append(' ');
        java.lang.String str6 = textBuffer1.contentsAsString();
        textBuffer1.append('#');
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithString(" ");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        textBuffer13.setCurrentLength(1);
        boolean boolean16 = textBuffer13.hasTextAsCharacters();
        int int17 = textBuffer13.getTextOffset();
        char[] charArray18 = textBuffer13.emptyAndGetCurrentSegment();
        textBuffer13.setCurrentLength(262144);
        textBuffer13.setCurrentLength((int) (short) 10);
        char[] charArray23 = textBuffer13.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler24 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer25 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler24);
        char[] charArray26 = textBuffer25.getCurrentSegment();
        char[] charArray28 = textBuffer25.expandCurrentSegment((int) (byte) 1);
        textBuffer25.resetWithString("hi!");
        textBuffer25.releaseBuffers();
        char[] charArray32 = textBuffer25.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler33 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer34 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler33);
        char[] charArray35 = textBuffer34.getCurrentSegment();
        char[] charArray37 = textBuffer34.expandCurrentSegment((int) (byte) 1);
        java.lang.String str38 = textBuffer34.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler39 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer40 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler39);
        char[] charArray41 = textBuffer40.getCurrentSegment();
        char[] charArray42 = textBuffer40.getCurrentSegment();
        textBuffer34.resetWithCopy(charArray42, (int) '4', 1);
        textBuffer25.append(charArray42, (int) (short) 0, 3);
        char[] charArray49 = textBuffer25.getCurrentSegment();
        textBuffer25.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler52 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer53 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler52);
        textBuffer53.setCurrentLength(1);
        char[] charArray56 = textBuffer53.getCurrentSegment();
        char[] charArray57 = textBuffer53.contentsAsArray();
        int int58 = textBuffer53.getTextOffset();
        char[] charArray59 = textBuffer53.contentsAsArray();
        char[] charArray60 = textBuffer53.contentsAsArray();
        textBuffer25.resetWithShared(charArray60, (int) '#', (-1));
        textBuffer13.resetWithShared(charArray60, (int) (short) -1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray60, 262144, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 262196 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertArrayEquals(charArray57, new char[] {});
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] {});
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertArrayEquals(charArray60, new char[] {});
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.setCurrentLength((int) ' ');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        textBuffer6.setCurrentLength(1);
        boolean boolean9 = textBuffer6.hasTextAsCharacters();
        int int10 = textBuffer6.getCurrentSegmentSize();
        char[] charArray11 = textBuffer6.getTextBuffer();
        char[] charArray12 = textBuffer6.emptyAndGetCurrentSegment();
        char[] charArray18 = new char[] { 'a', '#', ' ', '#', '#' };
        textBuffer6.resetWithShared(charArray18, 1000, 262144);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray18, (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(charArray11);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { 'a', '#', ' ', '#', '#' });
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        textBuffer4.setCurrentLength(1);
        char[] charArray7 = textBuffer4.getCurrentSegment();
        boolean boolean8 = textBuffer4.hasTextAsCharacters();
        char[] charArray9 = textBuffer4.getCurrentSegment();
        textBuffer1.resetWithShared(charArray9, 1, (int) '#');
        char[] charArray13 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal14 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"???????????????????????????????????\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray13);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        textBuffer1.setCurrentLength(3);
        int int15 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal16 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.setCurrentLength(262144);
        textBuffer1.setCurrentLength((int) (short) 10);
        char[] charArray11 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        char[] charArray14 = textBuffer13.getCurrentSegment();
        char[] charArray16 = textBuffer13.expandCurrentSegment((int) (byte) 1);
        textBuffer13.resetWithString("hi!");
        textBuffer13.releaseBuffers();
        char[] charArray20 = textBuffer13.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer22 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler21);
        char[] charArray23 = textBuffer22.getCurrentSegment();
        char[] charArray25 = textBuffer22.expandCurrentSegment((int) (byte) 1);
        java.lang.String str26 = textBuffer22.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer28 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler27);
        char[] charArray29 = textBuffer28.getCurrentSegment();
        char[] charArray30 = textBuffer28.getCurrentSegment();
        textBuffer22.resetWithCopy(charArray30, (int) '4', 1);
        textBuffer13.append(charArray30, (int) (short) 0, 3);
        char[] charArray37 = textBuffer13.getCurrentSegment();
        textBuffer13.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler40 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer41 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler40);
        textBuffer41.setCurrentLength(1);
        char[] charArray44 = textBuffer41.getCurrentSegment();
        char[] charArray45 = textBuffer41.contentsAsArray();
        int int46 = textBuffer41.getTextOffset();
        char[] charArray47 = textBuffer41.contentsAsArray();
        char[] charArray48 = textBuffer41.contentsAsArray();
        textBuffer13.resetWithShared(charArray48, (int) '#', (-1));
        textBuffer1.resetWithShared(charArray48, (int) (short) -1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000", (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 52, length 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] {});
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] {});
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] {});
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        textBuffer1.append(' ');
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        textBuffer8.setCurrentLength(1);
        boolean boolean11 = textBuffer8.hasTextAsCharacters();
        int int12 = textBuffer8.getTextOffset();
        char[] charArray13 = textBuffer8.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray13, (-1), 35);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal17 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray13);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("hi!");
        java.lang.String str5 = textBuffer1.toString();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 32, end 84, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("hi!");
        java.lang.String str5 = textBuffer1.toString();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        char[] charArray10 = textBuffer1.contentsAsArray();
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000", 3, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        char[] charArray11 = textBuffer1.getTextBuffer();
        char[] charArray12 = textBuffer1.contentsAsArray();
        java.lang.String str13 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray7 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal8 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        textBuffer7.releaseBuffers();
        textBuffer7.resetWithString("hi!");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        textBuffer12.setCurrentLength(1);
        char[] charArray15 = textBuffer12.getCurrentSegment();
        char[] charArray16 = textBuffer12.contentsAsArray();
        char[] charArray17 = textBuffer12.getTextBuffer();
        textBuffer7.resetWithShared(charArray17, 100, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray17, 35, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 36 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.append('a');
        char[] charArray9 = textBuffer1.getTextBuffer();
        textBuffer1.setCurrentLength(1000);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        textBuffer13.releaseBuffers();
        char[] charArray15 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer13.resetWithShared(charArray15, (int) '#', (int) (byte) 10);
        textBuffer13.resetWithString("");
        boolean boolean21 = textBuffer13.hasTextAsCharacters();
        int int22 = textBuffer13.size();
        char[] charArray23 = textBuffer13.contentsAsArray();
        textBuffer1.resetWithShared(charArray23, 1, 0);
        java.lang.String str27 = textBuffer1.toString();
        java.lang.String str28 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000", 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 100, end 99, length 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        char[] charArray9 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("hi!", 0, 262144);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        int int12 = textBuffer1.getTextOffset();
        textBuffer1.setCurrentLength((int) (byte) 100);
        char[] charArray15 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer17 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler16);
        textBuffer17.releaseBuffers();
        char[] charArray19 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer17.resetWithShared(charArray19, (int) '#', (int) (byte) 10);
        textBuffer17.resetWithString("");
        char[] charArray25 = textBuffer17.getTextBuffer();
        char[] charArray26 = textBuffer17.getCurrentSegment();
        boolean boolean27 = textBuffer17.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler28 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer29 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler28);
        char[] charArray30 = textBuffer29.getCurrentSegment();
        char[] charArray31 = textBuffer29.getCurrentSegment();
        textBuffer29.append(' ');
        java.lang.String str34 = textBuffer29.contentsAsString();
        char[] charArray35 = textBuffer29.emptyAndGetCurrentSegment();
        textBuffer17.resetWithShared(charArray35, (int) (short) 1, (int) (byte) 10);
        textBuffer1.append(charArray35, 0, (int) (byte) 1);
        int int42 = textBuffer1.size();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] {});
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + " " + "'", str34, " ");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 101 + "'", int42 == 101);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        java.lang.String str5 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        char[] charArray8 = textBuffer7.getCurrentSegment();
        char[] charArray9 = textBuffer7.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray9, (int) '4', 1);
        textBuffer1.resetWithString(" ");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        textBuffer16.setCurrentLength(1);
        char[] charArray19 = textBuffer16.getCurrentSegment();
        char[] charArray20 = textBuffer16.contentsAsArray();
        int int21 = textBuffer16.getTextOffset();
        int int22 = textBuffer16.getCurrentSegmentSize();
        textBuffer16.releaseBuffers();
        char[] charArray24 = textBuffer16.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray24, 0, (int) (short) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler28 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer29 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler28);
        char[] charArray30 = textBuffer29.getCurrentSegment();
        char[] charArray32 = textBuffer29.expandCurrentSegment((int) (byte) 1);
        char[] charArray33 = textBuffer29.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler34 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer35 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler34);
        textBuffer35.releaseBuffers();
        char[] charArray37 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer35.resetWithShared(charArray37, (int) '#', (int) (byte) 10);
        textBuffer35.resetWithString("");
        boolean boolean43 = textBuffer35.hasTextAsCharacters();
        int int44 = textBuffer35.size();
        textBuffer35.releaseBuffers();
        int int46 = textBuffer35.getTextOffset();
        char[] charArray47 = textBuffer35.contentsAsArray();
        textBuffer29.resetWithShared(charArray47, 0, 0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler51 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer52 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler51);
        textBuffer52.setCurrentLength(1);
        boolean boolean55 = textBuffer52.hasTextAsCharacters();
        int int56 = textBuffer52.getTextOffset();
        char[] charArray57 = textBuffer52.contentsAsArray();
        char[] charArray58 = textBuffer52.contentsAsArray();
        textBuffer29.resetWithShared(charArray58, (-1), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray58, 0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 3 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] {});
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertArrayEquals(charArray57, new char[] {});
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertArrayEquals(charArray58, new char[] {});
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        char[] charArray11 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        char[] charArray14 = textBuffer1.expandCurrentSegment(0);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 10, end 107, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray14);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        char[] charArray7 = textBuffer1.contentsAsArray();
        char[] charArray8 = textBuffer1.contentsAsArray();
        textBuffer1.append('4');
        char[] charArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray11, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.append('a');
        char[] charArray9 = textBuffer1.getTextBuffer();
        textBuffer1.setCurrentLength(1000);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        textBuffer13.releaseBuffers();
        char[] charArray15 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer13.resetWithShared(charArray15, (int) '#', (int) (byte) 10);
        textBuffer13.resetWithString("");
        boolean boolean21 = textBuffer13.hasTextAsCharacters();
        int int22 = textBuffer13.size();
        char[] charArray23 = textBuffer13.contentsAsArray();
        textBuffer1.resetWithShared(charArray23, 1, 0);
        java.lang.String str27 = textBuffer1.toString();
        java.lang.String str28 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double29 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        textBuffer1.setCurrentLength(3);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        char[] charArray17 = textBuffer16.getCurrentSegment();
        char[] charArray19 = textBuffer16.expandCurrentSegment((int) (byte) 1);
        char[] charArray20 = textBuffer16.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray20, 0, 35);
        textBuffer1.setCurrentLength((int) (short) -1);
        textBuffer1.resetWithString("4");
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray20);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        java.lang.String str10 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal11 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.append('a');
        char[] charArray9 = textBuffer1.getTextBuffer();
        textBuffer1.setCurrentLength(1000);
        char[] charArray12 = textBuffer1.contentsAsArray();
        textBuffer1.append('4');
        // The following exception was thrown during execution in test generation
        try {
            double double15 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a???????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????4\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray12);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.append(' ');
        char[] charArray9 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str10 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        textBuffer12.releaseBuffers();
        char[] charArray14 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer12.resetWithShared(charArray14, (int) '#', (int) (byte) 10);
        textBuffer12.resetWithString("");
        boolean boolean20 = textBuffer12.hasTextAsCharacters();
        int int21 = textBuffer12.size();
        char[] charArray22 = textBuffer12.contentsAsArray();
        textBuffer12.resetWithString("hi!");
        java.lang.String str25 = textBuffer12.toString();
        char[] charArray26 = textBuffer12.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray26, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 36 out of bounds for char[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { 'h', 'i', '!' });
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        int int11 = textBuffer1.size();
        char[] charArray12 = textBuffer1.contentsAsArray();
        char[] charArray13 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithString("a");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray13);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        java.lang.String str4 = textBuffer1.toString();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        textBuffer9.setCurrentLength(1);
        boolean boolean12 = textBuffer9.hasTextAsCharacters();
        int int13 = textBuffer9.getCurrentSegmentSize();
        char[] charArray14 = textBuffer9.getCurrentSegment();
        textBuffer9.append('a');
        char[] charArray17 = textBuffer9.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray17, 10, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 1010 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray17);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        char[] charArray9 = textBuffer1.getTextBuffer();
        char[] charArray10 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        char[] charArray13 = textBuffer1.contentsAsArray();
        java.lang.String str14 = textBuffer1.contentsAsString();
        java.lang.Class<?> wildcardClass15 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray12 = textBuffer1.expandCurrentSegment((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        int int7 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((int) (short) 100);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        textBuffer11.setCurrentLength(1);
        char[] charArray14 = textBuffer11.getCurrentSegment();
        boolean boolean15 = textBuffer11.hasTextAsCharacters();
        textBuffer11.append('a');
        boolean boolean18 = textBuffer11.hasTextAsCharacters();
        textBuffer11.setCurrentLength((int) (short) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer22 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler21);
        char[] charArray23 = textBuffer22.getCurrentSegment();
        char[] charArray25 = textBuffer22.expandCurrentSegment((int) (byte) 1);
        java.lang.String str26 = textBuffer22.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer28 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler27);
        char[] charArray29 = textBuffer28.getCurrentSegment();
        char[] charArray30 = textBuffer28.getCurrentSegment();
        textBuffer22.resetWithCopy(charArray30, (int) '4', 1);
        textBuffer11.resetWithShared(charArray30, (int) (byte) 100, (int) (short) 10);
        char[] charArray37 = textBuffer11.contentsAsArray();
        textBuffer11.append(' ');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler40 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer41 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler40);
        textBuffer41.setCurrentLength(1);
        boolean boolean44 = textBuffer41.hasTextAsCharacters();
        int int45 = textBuffer41.getTextOffset();
        char[] charArray46 = textBuffer41.emptyAndGetCurrentSegment();
        textBuffer41.setCurrentLength(262144);
        textBuffer41.setCurrentLength((int) (short) 10);
        char[] charArray51 = textBuffer41.contentsAsArray();
        textBuffer11.resetWithShared(charArray51, 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray51, 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 45 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertArrayEquals(charArray51, new char[] { '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 52, end 52, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        char[] charArray9 = textBuffer1.expandCurrentSegment(100);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        textBuffer11.setCurrentLength(1);
        char[] charArray14 = textBuffer11.getCurrentSegment();
        char[] charArray15 = textBuffer11.contentsAsArray();
        java.lang.String str16 = textBuffer11.contentsAsString();
        textBuffer11.append('a');
        char[] charArray20 = textBuffer11.expandCurrentSegment((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray20, (int) (short) 100, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 1100 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charArray20);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        textBuffer6.setCurrentLength(1);
        char[] charArray9 = textBuffer6.getCurrentSegment();
        char[] charArray10 = textBuffer6.contentsAsArray();
        char[] charArray11 = textBuffer6.getTextBuffer();
        textBuffer1.resetWithShared(charArray11, 100, (int) (byte) 0);
        textBuffer1.releaseBuffers();
        int int16 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray18 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        char[] charArray6 = textBuffer1.contentsAsArray();
        textBuffer1.append('4');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        char[] charArray11 = textBuffer10.getCurrentSegment();
        textBuffer10.resetWithString("hi!");
        java.lang.String str14 = textBuffer10.toString();
        java.lang.String str15 = textBuffer10.contentsAsString();
        char[] charArray17 = textBuffer10.expandCurrentSegment((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray17, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(charArray17);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = textBuffer1.contentsAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 35, count 10, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        char[] charArray6 = textBuffer1.contentsAsArray();
        textBuffer1.append('4');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        textBuffer10.setCurrentLength(1);
        char[] charArray13 = textBuffer10.getCurrentSegment();
        char[] charArray14 = textBuffer10.contentsAsArray();
        char[] charArray15 = textBuffer10.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray15, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        int int11 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("hi!");
        boolean boolean14 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer5 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler4);
        textBuffer5.setCurrentLength(1);
        boolean boolean8 = textBuffer5.hasTextAsCharacters();
        int int9 = textBuffer5.getTextOffset();
        char[] charArray10 = textBuffer5.contentsAsArray();
        textBuffer1.resetWithShared(charArray10, (int) (byte) 1, (int) '#');
        int int14 = textBuffer1.size();
        char[] charArray15 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray16 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        char[] charArray9 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        textBuffer11.setCurrentLength(1);
        char[] charArray14 = textBuffer11.getCurrentSegment();
        boolean boolean15 = textBuffer11.hasTextAsCharacters();
        textBuffer11.append('a');
        boolean boolean18 = textBuffer11.hasTextAsCharacters();
        char[] charArray19 = textBuffer11.getCurrentSegment();
        boolean boolean20 = textBuffer11.hasTextAsCharacters();
        int int21 = textBuffer11.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer23 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler22);
        textBuffer23.releaseBuffers();
        char[] charArray25 = textBuffer23.getCurrentSegment();
        textBuffer11.resetWithShared(charArray25, (int) 'a', 0);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray25, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(charArray25);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        textBuffer1.setCurrentLength((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal12 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        java.lang.String str4 = textBuffer1.toString();
        textBuffer1.resetWithString("hi!");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        java.lang.String str8 = textBuffer1.toString();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("hi!");
        java.lang.String str5 = textBuffer1.toString();
        java.lang.String str6 = textBuffer1.contentsAsString();
        int int7 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal8 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        char[] charArray11 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithString("hi!");
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray15 = textBuffer1.expandCurrentSegment((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        int int11 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("hi!");
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        int int7 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        char[] charArray10 = textBuffer9.getCurrentSegment();
        textBuffer1.resetWithShared(charArray10, 10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(" ", (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 10, end 62, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray8 = textBuffer1.expandCurrentSegment((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        textBuffer1.resetWithEmpty();
        int int6 = textBuffer1.getTextOffset();
        java.lang.Class<?> wildcardClass7 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (int) (byte) 100, 262144);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        textBuffer1.resetWithEmpty();
        java.lang.String str10 = textBuffer1.toString();
        char[] charArray11 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        int int11 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("hi!");
        boolean boolean14 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        textBuffer16.releaseBuffers();
        char[] charArray18 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer16.resetWithShared(charArray18, (int) '#', (int) (byte) 10);
        textBuffer16.resetWithString("");
        boolean boolean24 = textBuffer16.hasTextAsCharacters();
        int int25 = textBuffer16.size();
        char[] charArray26 = textBuffer16.getTextBuffer();
        char[] charArray27 = textBuffer16.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray27, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] {});
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        textBuffer1.append('a');
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal5 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"a\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        int int12 = textBuffer1.getTextOffset();
        textBuffer1.setCurrentLength((int) (byte) 100);
        char[] charArray15 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        char[] charArray19 = textBuffer18.getCurrentSegment();
        char[] charArray20 = textBuffer18.getCurrentSegment();
        textBuffer18.append(' ');
        java.lang.String str23 = textBuffer18.contentsAsString();
        char[] charArray24 = textBuffer18.emptyAndGetCurrentSegment();
        textBuffer1.append(charArray24, (int) (short) 100, (int) (short) 0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler28 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer29 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler28);
        textBuffer29.releaseBuffers();
        char[] charArray31 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer29.resetWithShared(charArray31, (int) '#', (int) (byte) 10);
        textBuffer29.resetWithString("");
        char[] charArray37 = textBuffer29.getTextBuffer();
        char[] charArray38 = textBuffer29.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray38, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " " + "'", str23, " ");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] {});
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] {});
        org.junit.Assert.assertNotNull(charArray38);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        char[] charArray11 = textBuffer10.getCurrentSegment();
        textBuffer10.resetWithString("hi!");
        java.lang.String str14 = textBuffer10.toString();
        java.lang.String str15 = textBuffer10.contentsAsString();
        int int16 = textBuffer10.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        textBuffer18.releaseBuffers();
        char[] charArray20 = textBuffer18.contentsAsArray();
        textBuffer10.resetWithShared(charArray20, (int) (byte) -1, 262144);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray20, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 98 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        int int5 = textBuffer1.size();
        java.lang.String str6 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        char[] charArray10 = textBuffer9.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        textBuffer12.setCurrentLength(1);
        char[] charArray15 = textBuffer12.getCurrentSegment();
        boolean boolean16 = textBuffer12.hasTextAsCharacters();
        char[] charArray17 = textBuffer12.getCurrentSegment();
        textBuffer9.resetWithShared(charArray17, 1, (int) '#');
        char[] charArray21 = textBuffer9.getCurrentSegment();
        boolean boolean22 = textBuffer9.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer24 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler23);
        char[] charArray25 = textBuffer24.getCurrentSegment();
        char[] charArray27 = textBuffer24.expandCurrentSegment((int) (byte) 1);
        char[] charArray28 = textBuffer24.emptyAndGetCurrentSegment();
        boolean boolean29 = textBuffer24.hasTextAsCharacters();
        textBuffer24.releaseBuffers();
        boolean boolean31 = textBuffer24.hasTextAsCharacters();
        boolean boolean32 = textBuffer24.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler33 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer34 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler33);
        textBuffer34.setCurrentLength(1);
        char[] charArray37 = textBuffer34.getCurrentSegment();
        char[] charArray38 = textBuffer34.contentsAsArray();
        int int39 = textBuffer34.getTextOffset();
        int int40 = textBuffer34.getCurrentSegmentSize();
        textBuffer34.releaseBuffers();
        char[] charArray42 = textBuffer34.getCurrentSegment();
        textBuffer24.resetWithCopy(charArray42, 0, (int) (byte) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler46 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer47 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler46);
        char[] charArray48 = textBuffer47.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler49 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer50 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler49);
        textBuffer50.setCurrentLength(1);
        char[] charArray53 = textBuffer50.getCurrentSegment();
        boolean boolean54 = textBuffer50.hasTextAsCharacters();
        char[] charArray55 = textBuffer50.getCurrentSegment();
        textBuffer47.resetWithShared(charArray55, 1, (int) '#');
        char[] charArray59 = textBuffer47.getCurrentSegment();
        char[] charArray60 = textBuffer47.emptyAndGetCurrentSegment();
        textBuffer24.resetWithShared(charArray60, (int) (short) 0, 262144);
        textBuffer9.resetWithCopy(charArray60, (int) (byte) 100, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray60, 1000, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 1001 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] {});
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] {});
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertNotNull(charArray60);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        int int5 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        textBuffer7.setCurrentLength(1);
        char[] charArray10 = textBuffer7.getCurrentSegment();
        boolean boolean11 = textBuffer7.hasTextAsCharacters();
        textBuffer7.append('a');
        boolean boolean14 = textBuffer7.hasTextAsCharacters();
        char[] charArray15 = textBuffer7.getCurrentSegment();
        boolean boolean16 = textBuffer7.hasTextAsCharacters();
        int int17 = textBuffer7.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        textBuffer19.releaseBuffers();
        char[] charArray21 = textBuffer19.getCurrentSegment();
        textBuffer7.resetWithShared(charArray21, (int) 'a', 0);
        char[] charArray25 = textBuffer7.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray25, (int) (short) 0, (-1));
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal30 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray25);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        textBuffer1.resetWithString("hi!");
        textBuffer1.releaseBuffers();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        char[] charArray11 = textBuffer10.getCurrentSegment();
        char[] charArray13 = textBuffer10.expandCurrentSegment((int) (byte) 1);
        java.lang.String str14 = textBuffer10.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        char[] charArray17 = textBuffer16.getCurrentSegment();
        char[] charArray18 = textBuffer16.getCurrentSegment();
        textBuffer10.resetWithCopy(charArray18, (int) '4', 1);
        textBuffer1.append(charArray18, (int) (short) 0, 3);
        char[] charArray25 = textBuffer1.getCurrentSegment();
        int int26 = textBuffer1.size();
        int int27 = textBuffer1.size();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        int int10 = textBuffer1.size();
        char[] charArray12 = textBuffer1.expandCurrentSegment(35);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler13 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer14 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler13);
        textBuffer14.releaseBuffers();
        char[] charArray16 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer14.resetWithShared(charArray16, (int) '#', (int) (byte) 10);
        textBuffer14.resetWithString("");
        boolean boolean22 = textBuffer14.hasTextAsCharacters();
        int int23 = textBuffer14.size();
        textBuffer14.releaseBuffers();
        int int25 = textBuffer14.getTextOffset();
        char[] charArray26 = textBuffer14.contentsAsArray();
        textBuffer1.resetWithShared(charArray26, (int) ' ', 3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = textBuffer1.contentsAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 32, count 3, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        textBuffer6.setCurrentLength(1);
        char[] charArray9 = textBuffer6.getCurrentSegment();
        char[] charArray10 = textBuffer6.contentsAsArray();
        char[] charArray11 = textBuffer6.getTextBuffer();
        textBuffer1.resetWithShared(charArray11, 100, (int) (byte) 0);
        textBuffer1.releaseBuffers();
        int int16 = textBuffer1.getCurrentSegmentSize();
        char[] charArray17 = textBuffer1.getCurrentSegment();
        textBuffer1.setCurrentLength(10);
        textBuffer1.resetWithString(" ");
        textBuffer1.resetWithEmpty();
        char[] charArray23 = null;
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray23, 100, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray17);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.append('a');
        char[] charArray9 = textBuffer1.getTextBuffer();
        textBuffer1.setCurrentLength(1000);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        textBuffer13.releaseBuffers();
        char[] charArray15 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer13.resetWithShared(charArray15, (int) '#', (int) (byte) 10);
        textBuffer13.resetWithString("");
        boolean boolean21 = textBuffer13.hasTextAsCharacters();
        int int22 = textBuffer13.size();
        char[] charArray23 = textBuffer13.contentsAsArray();
        textBuffer1.resetWithShared(charArray23, 1, 0);
        textBuffer1.append(' ');
        textBuffer1.resetWithString("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.contentsAsArray();
        char[] charArray7 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray8 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        int int7 = textBuffer1.getCurrentSegmentSize();
        int int8 = textBuffer1.getCurrentSegmentSize();
        char[] charArray9 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray10 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        textBuffer6.setCurrentLength(1);
        char[] charArray9 = textBuffer6.getCurrentSegment();
        char[] charArray10 = textBuffer6.contentsAsArray();
        char[] charArray11 = textBuffer6.getTextBuffer();
        textBuffer1.resetWithShared(charArray11, 100, (int) (byte) 0);
        textBuffer1.releaseBuffers();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer17 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler16);
        textBuffer17.releaseBuffers();
        char[] charArray19 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer17.resetWithShared(charArray19, (int) '#', (int) (byte) 10);
        textBuffer17.resetWithString("");
        boolean boolean25 = textBuffer17.hasTextAsCharacters();
        int int26 = textBuffer17.size();
        char[] charArray27 = textBuffer17.getTextBuffer();
        char[] charArray28 = textBuffer17.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray28, (int) (short) -1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] {});
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        char[] charArray7 = textBuffer1.contentsAsArray();
        char[] charArray8 = textBuffer1.contentsAsArray();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        textBuffer11.releaseBuffers();
        char[] charArray13 = textBuffer11.contentsAsArray();
        textBuffer11.resetWithEmpty();
        int int15 = textBuffer11.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer17 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler16);
        textBuffer17.setCurrentLength(1);
        char[] charArray20 = textBuffer17.getCurrentSegment();
        boolean boolean21 = textBuffer17.hasTextAsCharacters();
        textBuffer17.append('a');
        boolean boolean24 = textBuffer17.hasTextAsCharacters();
        char[] charArray25 = textBuffer17.getCurrentSegment();
        boolean boolean26 = textBuffer17.hasTextAsCharacters();
        int int27 = textBuffer17.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler28 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer29 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler28);
        textBuffer29.releaseBuffers();
        char[] charArray31 = textBuffer29.getCurrentSegment();
        textBuffer17.resetWithShared(charArray31, (int) 'a', 0);
        char[] charArray35 = textBuffer17.emptyAndGetCurrentSegment();
        textBuffer11.resetWithShared(charArray35, (int) (short) 0, (-1));
        textBuffer1.resetWithShared(charArray35, 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass42 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        int int7 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.releaseBuffers();
        char[] charArray9 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        textBuffer11.setCurrentLength(1);
        char[] charArray14 = textBuffer11.getCurrentSegment();
        boolean boolean15 = textBuffer11.hasTextAsCharacters();
        textBuffer11.append('a');
        boolean boolean18 = textBuffer11.hasTextAsCharacters();
        textBuffer11.setCurrentLength((int) (short) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer22 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler21);
        char[] charArray23 = textBuffer22.getCurrentSegment();
        char[] charArray25 = textBuffer22.expandCurrentSegment((int) (byte) 1);
        java.lang.String str26 = textBuffer22.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer28 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler27);
        char[] charArray29 = textBuffer28.getCurrentSegment();
        char[] charArray30 = textBuffer28.getCurrentSegment();
        textBuffer22.resetWithCopy(charArray30, (int) '4', 1);
        textBuffer11.resetWithShared(charArray30, (int) (byte) 100, (int) (short) 10);
        char[] charArray37 = textBuffer11.contentsAsArray();
        char[] charArray38 = textBuffer11.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray38, (int) (byte) -1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
        org.junit.Assert.assertNotNull(charArray38);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        char[] charArray11 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        int int13 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 3, 101);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 3, end 104, length 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        int int11 = textBuffer1.size();
        char[] charArray12 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler13 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer14 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler13);
        textBuffer14.setCurrentLength(1);
        char[] charArray17 = textBuffer14.getCurrentSegment();
        char[] charArray18 = textBuffer14.contentsAsArray();
        char[] charArray19 = textBuffer14.getTextBuffer();
        textBuffer1.resetWithShared(charArray19, 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("4", (int) (short) 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 52 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getTextBuffer();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray13 = new char[] { 'a', '#', ' ', '#', '#' };
        textBuffer1.resetWithShared(charArray13, 1000, 262144);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        textBuffer18.setCurrentLength(1);
        char[] charArray21 = textBuffer18.getCurrentSegment();
        char[] charArray22 = textBuffer18.contentsAsArray();
        int int23 = textBuffer18.getTextOffset();
        int int24 = textBuffer18.getCurrentSegmentSize();
        textBuffer18.resetWithEmpty();
        char[] charArray26 = textBuffer18.emptyAndGetCurrentSegment();
        char[] charArray27 = textBuffer18.emptyAndGetCurrentSegment();
        textBuffer1.resetWithCopy(charArray27, (int) (byte) 100, (int) '#');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler31 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer32 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler31);
        textBuffer32.releaseBuffers();
        char[] charArray34 = textBuffer32.getCurrentSegment();
        boolean boolean35 = textBuffer32.hasTextAsCharacters();
        char[] charArray36 = textBuffer32.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray36, (int) (byte) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal40 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"????????????????????????????????????????????????????????????????????????????????????????????????????\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { 'a', '#', ' ', '#', '#' });
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(charArray36);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        char[] charArray9 = textBuffer1.getTextBuffer();
        int int10 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        char[] charArray15 = new char[] { 'a', '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray15, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 67 out of bounds for char[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { 'a', '4', ' ' });
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (short) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        char[] charArray13 = textBuffer12.getCurrentSegment();
        char[] charArray15 = textBuffer12.expandCurrentSegment((int) (byte) 1);
        java.lang.String str16 = textBuffer12.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        char[] charArray19 = textBuffer18.getCurrentSegment();
        char[] charArray20 = textBuffer18.getCurrentSegment();
        textBuffer12.resetWithCopy(charArray20, (int) '4', 1);
        textBuffer1.resetWithShared(charArray20, (int) (byte) 100, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("a", 97, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 97, end 97, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray20);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.append('a');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        char[] charArray11 = textBuffer10.getCurrentSegment();
        char[] charArray12 = textBuffer10.getCurrentSegment();
        textBuffer10.append(' ');
        java.lang.String str15 = textBuffer10.contentsAsString();
        char[] charArray16 = textBuffer10.emptyAndGetCurrentSegment();
        char[] charArray17 = textBuffer10.getCurrentSegment();
        char[] charArray18 = textBuffer10.getCurrentSegment();
        textBuffer1.resetWithShared(charArray18, 97, 35);
        java.lang.String str22 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double23 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " " + "'", str15, " ");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str22, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        java.lang.String str9 = textBuffer1.toString();
        java.lang.String str10 = textBuffer1.contentsAsString();
        textBuffer1.resetWithEmpty();
        java.lang.String str12 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        int int10 = textBuffer1.size();
        char[] charArray12 = textBuffer1.expandCurrentSegment(35);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(charArray12);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        textBuffer1.releaseBuffers();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        char[] charArray16 = textBuffer15.getCurrentSegment();
        char[] charArray18 = textBuffer15.expandCurrentSegment((int) (byte) 1);
        char[] charArray19 = textBuffer15.emptyAndGetCurrentSegment();
        boolean boolean20 = textBuffer15.hasTextAsCharacters();
        textBuffer15.releaseBuffers();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer23 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler22);
        textBuffer23.setCurrentLength(1);
        boolean boolean26 = textBuffer23.hasTextAsCharacters();
        int int27 = textBuffer23.getCurrentSegmentSize();
        char[] charArray28 = textBuffer23.getTextBuffer();
        char[] charArray29 = textBuffer23.emptyAndGetCurrentSegment();
        textBuffer15.resetWithShared(charArray29, 100, 0);
        textBuffer1.resetWithShared(charArray29, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            double double36 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNull(charArray28);
        org.junit.Assert.assertNotNull(charArray29);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        textBuffer1.append('a');
        textBuffer1.setCurrentLength(1000);
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        textBuffer4.setCurrentLength(1);
        char[] charArray7 = textBuffer4.getCurrentSegment();
        boolean boolean8 = textBuffer4.hasTextAsCharacters();
        char[] charArray9 = textBuffer4.getCurrentSegment();
        textBuffer1.resetWithShared(charArray9, 1, (int) '#');
        char[] charArray13 = textBuffer1.getCurrentSegment();
        boolean boolean14 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        char[] charArray17 = textBuffer16.getCurrentSegment();
        char[] charArray19 = textBuffer16.expandCurrentSegment((int) (byte) 1);
        char[] charArray20 = textBuffer16.emptyAndGetCurrentSegment();
        boolean boolean21 = textBuffer16.hasTextAsCharacters();
        textBuffer16.releaseBuffers();
        boolean boolean23 = textBuffer16.hasTextAsCharacters();
        boolean boolean24 = textBuffer16.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer26 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler25);
        textBuffer26.setCurrentLength(1);
        char[] charArray29 = textBuffer26.getCurrentSegment();
        char[] charArray30 = textBuffer26.contentsAsArray();
        int int31 = textBuffer26.getTextOffset();
        int int32 = textBuffer26.getCurrentSegmentSize();
        textBuffer26.releaseBuffers();
        char[] charArray34 = textBuffer26.getCurrentSegment();
        textBuffer16.resetWithCopy(charArray34, 0, (int) (byte) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler38 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer39 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler38);
        char[] charArray40 = textBuffer39.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler41 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer42 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler41);
        textBuffer42.setCurrentLength(1);
        char[] charArray45 = textBuffer42.getCurrentSegment();
        boolean boolean46 = textBuffer42.hasTextAsCharacters();
        char[] charArray47 = textBuffer42.getCurrentSegment();
        textBuffer39.resetWithShared(charArray47, 1, (int) '#');
        char[] charArray51 = textBuffer39.getCurrentSegment();
        char[] charArray52 = textBuffer39.emptyAndGetCurrentSegment();
        textBuffer16.resetWithShared(charArray52, (int) (short) 0, 262144);
        textBuffer1.resetWithCopy(charArray52, (int) (byte) 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass59 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] {});
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        int int7 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.releaseBuffers();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        textBuffer1.setCurrentLength((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        textBuffer12.releaseBuffers();
        char[] charArray14 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer12.resetWithShared(charArray14, (int) '#', (int) (byte) 10);
        textBuffer12.resetWithString("");
        boolean boolean20 = textBuffer12.hasTextAsCharacters();
        char[] charArray21 = textBuffer12.emptyAndGetCurrentSegment();
        textBuffer1.append(charArray21, (int) (short) 10, (int) (short) 1);
        textBuffer1.resetWithString("");
        char[] charArray27 = textBuffer1.getCurrentSegment();
        java.lang.String str28 = textBuffer1.toString();
        int int29 = textBuffer1.getTextOffset();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        java.lang.String str10 = textBuffer1.toString();
        int int11 = textBuffer1.getTextOffset();
        int int12 = textBuffer1.size();
        int int13 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray14 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        int int5 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray7 = textBuffer1.expandCurrentSegment(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithEmpty();
        textBuffer1.setCurrentLength((int) ' ');
        textBuffer1.setCurrentLength(1000);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        textBuffer12.releaseBuffers();
        char[] charArray14 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer12.resetWithShared(charArray14, (int) '#', (int) (byte) 10);
        textBuffer12.resetWithString("");
        boolean boolean20 = textBuffer12.hasTextAsCharacters();
        char[] charArray21 = textBuffer12.emptyAndGetCurrentSegment();
        textBuffer1.append(charArray21, (int) (short) 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(charArray21);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        textBuffer1.append('a');
        char[] charArray5 = textBuffer1.contentsAsArray();
        char[] charArray7 = textBuffer1.expandCurrentSegment(101);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray7);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithString(" ");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        textBuffer4.setCurrentLength(1);
        char[] charArray7 = textBuffer4.getCurrentSegment();
        boolean boolean8 = textBuffer4.hasTextAsCharacters();
        char[] charArray9 = textBuffer4.getCurrentSegment();
        textBuffer1.resetWithShared(charArray9, 1, (int) '#');
        char[] charArray13 = textBuffer1.getCurrentSegment();
        char[] charArray14 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray15 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.Class<?> wildcardClass16 = charArray15.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (short) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        char[] charArray13 = textBuffer12.getCurrentSegment();
        char[] charArray15 = textBuffer12.expandCurrentSegment((int) (byte) 1);
        java.lang.String str16 = textBuffer12.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        char[] charArray19 = textBuffer18.getCurrentSegment();
        char[] charArray20 = textBuffer18.getCurrentSegment();
        textBuffer12.resetWithCopy(charArray20, (int) '4', 1);
        textBuffer1.resetWithShared(charArray20, (int) (byte) 100, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal27 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"??????????\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray20);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (short) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        char[] charArray13 = textBuffer12.getCurrentSegment();
        char[] charArray15 = textBuffer12.expandCurrentSegment((int) (byte) 1);
        java.lang.String str16 = textBuffer12.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        char[] charArray19 = textBuffer18.getCurrentSegment();
        char[] charArray20 = textBuffer18.getCurrentSegment();
        textBuffer12.resetWithCopy(charArray20, (int) '4', 1);
        textBuffer1.resetWithShared(charArray20, (int) (byte) 100, (int) (short) 10);
        char[] charArray27 = textBuffer1.contentsAsArray();
        textBuffer1.append(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal30 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"?????????? \" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        textBuffer1.resetWithEmpty();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.setCurrentLength((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = textBuffer1.contentsAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        char[] charArray10 = textBuffer1.getTextBuffer();
        char[] charArray11 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.Class<?> wildcardClass12 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        textBuffer1.resetWithString("hi!");
        textBuffer1.releaseBuffers();
        char[] charArray8 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        textBuffer10.setCurrentLength(1);
        char[] charArray13 = textBuffer10.getCurrentSegment();
        char[] charArray14 = textBuffer10.contentsAsArray();
        int int15 = textBuffer10.getTextOffset();
        char[] charArray16 = textBuffer10.emptyAndGetCurrentSegment();
        textBuffer10.ensureNotShared();
        char[] charArray19 = textBuffer10.expandCurrentSegment((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray19, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray19);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithString("hi!");
        int int9 = textBuffer1.getTextOffset();
        textBuffer1.releaseBuffers();
        java.lang.Class<?> wildcardClass11 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("hi!");
        java.lang.String str5 = textBuffer1.toString();
        textBuffer1.append('#');
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        textBuffer10.setCurrentLength(1);
        char[] charArray13 = textBuffer10.getCurrentSegment();
        char[] charArray14 = textBuffer10.contentsAsArray();
        int int15 = textBuffer10.getTextOffset();
        int int16 = textBuffer10.getCurrentSegmentSize();
        textBuffer10.resetWithEmpty();
        char[] charArray18 = textBuffer10.emptyAndGetCurrentSegment();
        textBuffer1.append(charArray18, 10, 97);
        java.lang.Class<?> wildcardClass22 = charArray18.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        char[] charArray9 = textBuffer1.contentsAsArray();
        textBuffer1.setCurrentLength(100);
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithString("");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        int int3 = textBuffer1.getTextOffset();
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithEmpty();
        java.lang.String str6 = textBuffer1.contentsAsString();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", (int) (byte) -1, 262144);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        char[] charArray7 = textBuffer1.contentsAsArray();
        int int8 = textBuffer1.size();
        java.lang.String str9 = textBuffer1.contentsAsString();
        textBuffer1.setCurrentLength((int) (short) 100);
        textBuffer1.setCurrentLength((int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithString(" ");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        textBuffer9.releaseBuffers();
        char[] charArray11 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer9.resetWithShared(charArray11, (int) '#', (int) (byte) 10);
        textBuffer9.resetWithString("");
        boolean boolean17 = textBuffer9.hasTextAsCharacters();
        int int18 = textBuffer9.size();
        textBuffer9.releaseBuffers();
        textBuffer9.ensureNotShared();
        textBuffer9.setCurrentLength(3);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer24 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler23);
        char[] charArray25 = textBuffer24.getCurrentSegment();
        char[] charArray27 = textBuffer24.expandCurrentSegment((int) (byte) 1);
        char[] charArray28 = textBuffer24.emptyAndGetCurrentSegment();
        textBuffer9.resetWithShared(charArray28, 0, 35);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray28, 101, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertNotNull(charArray28);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        int int3 = textBuffer1.getTextOffset();
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithEmpty();
        java.lang.String str6 = textBuffer1.contentsAsString();
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal4 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        textBuffer7.setCurrentLength(1);
        char[] charArray10 = textBuffer7.getCurrentSegment();
        boolean boolean11 = textBuffer7.hasTextAsCharacters();
        char[] charArray12 = textBuffer7.getCurrentSegment();
        char[] charArray13 = textBuffer7.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray13, (int) (byte) 100, 10);
        textBuffer1.setCurrentLength((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(" ", 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 10, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        char[] charArray7 = textBuffer6.getCurrentSegment();
        char[] charArray9 = textBuffer6.expandCurrentSegment((int) (byte) 1);
        char[] charArray10 = textBuffer6.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        textBuffer12.setCurrentLength(1);
        char[] charArray15 = textBuffer12.getCurrentSegment();
        boolean boolean16 = textBuffer12.hasTextAsCharacters();
        char[] charArray17 = textBuffer12.getCurrentSegment();
        char[] charArray18 = textBuffer12.getCurrentSegment();
        textBuffer6.resetWithCopy(charArray18, (int) (byte) 100, 10);
        char[] charArray22 = textBuffer6.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray22, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 152 out of bounds for char[10]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getTextBuffer();
        textBuffer1.append('4');
        char[] charArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray9, (int) (byte) -1, 262144);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(charArray6);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        textBuffer12.releaseBuffers();
        char[] charArray14 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer12.resetWithShared(charArray14, (int) '#', (int) (byte) 10);
        textBuffer12.resetWithString("");
        boolean boolean20 = textBuffer12.hasTextAsCharacters();
        char[] charArray21 = textBuffer12.emptyAndGetCurrentSegment();
        textBuffer1.append(charArray21, (int) (short) 10, (int) (short) 1);
        textBuffer1.resetWithString("");
        char[] charArray27 = textBuffer1.getCurrentSegment();
        java.lang.String str28 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        textBuffer1.append(' ');
        java.lang.String str6 = textBuffer1.contentsAsString();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertNotNull(charArray7);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.contentsAsArray();
        char[] charArray7 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000");
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(" ", (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        java.lang.String str5 = textBuffer1.toString();
        textBuffer1.setCurrentLength((int) (short) 100);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        textBuffer9.setCurrentLength(1);
        char[] charArray12 = textBuffer9.getCurrentSegment();
        boolean boolean13 = textBuffer9.hasTextAsCharacters();
        textBuffer9.append('a');
        boolean boolean16 = textBuffer9.hasTextAsCharacters();
        char[] charArray17 = textBuffer9.getCurrentSegment();
        boolean boolean18 = textBuffer9.hasTextAsCharacters();
        char[] charArray19 = textBuffer9.contentsAsArray();
        int int20 = textBuffer9.getCurrentSegmentSize();
        textBuffer9.resetWithString(" ");
        char[] charArray24 = textBuffer9.expandCurrentSegment(10);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray24, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(charArray24);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.append('a');
        char[] charArray9 = textBuffer1.getTextBuffer();
        textBuffer1.setCurrentLength(1000);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        textBuffer13.releaseBuffers();
        char[] charArray15 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer13.resetWithShared(charArray15, (int) '#', (int) (byte) 10);
        textBuffer13.resetWithString("");
        boolean boolean21 = textBuffer13.hasTextAsCharacters();
        int int22 = textBuffer13.size();
        char[] charArray23 = textBuffer13.contentsAsArray();
        textBuffer1.resetWithShared(charArray23, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal27 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 1, count 0, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("");
        int int8 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        textBuffer10.setCurrentLength(1);
        boolean boolean13 = textBuffer10.hasTextAsCharacters();
        int int14 = textBuffer10.getTextOffset();
        char[] charArray15 = textBuffer10.contentsAsArray();
        char[] charArray16 = textBuffer10.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray16, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 62 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        int int5 = textBuffer1.size();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal7 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        int int11 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        textBuffer13.releaseBuffers();
        char[] charArray15 = textBuffer13.getCurrentSegment();
        textBuffer1.resetWithShared(charArray15, (int) 'a', 0);
        boolean boolean19 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer22 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler21);
        textBuffer22.releaseBuffers();
        char[] charArray24 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer22.resetWithShared(charArray24, (int) '#', (int) (byte) 10);
        textBuffer22.resetWithString("");
        char[] charArray30 = textBuffer22.contentsAsArray();
        textBuffer22.ensureNotShared();
        char[] charArray32 = textBuffer22.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray32, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 33 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] {});
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] {});
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        char[] charArray11 = textBuffer1.contentsAsArray();
        char[] charArray12 = textBuffer1.getTextBuffer();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler13 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer14 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler13);
        char[] charArray15 = textBuffer14.getCurrentSegment();
        char[] charArray16 = textBuffer14.getCurrentSegment();
        java.lang.String str17 = textBuffer14.toString();
        char[] charArray18 = textBuffer14.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray18, (-1), 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithString("");
        int int15 = textBuffer1.getTextOffset();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        java.lang.String str5 = textBuffer1.toString();
        textBuffer1.setCurrentLength(0);
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        textBuffer1.setCurrentLength(3);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        char[] charArray17 = textBuffer16.getCurrentSegment();
        char[] charArray19 = textBuffer16.expandCurrentSegment((int) (byte) 1);
        char[] charArray20 = textBuffer16.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray20, 0, 35);
        java.lang.Class<?> wildcardClass24 = charArray20.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        java.lang.String str6 = textBuffer1.contentsAsString();
        textBuffer1.append('a');
        char[] charArray9 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal10 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"a\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        textBuffer7.setCurrentLength(1);
        char[] charArray10 = textBuffer7.getCurrentSegment();
        boolean boolean11 = textBuffer7.hasTextAsCharacters();
        char[] charArray12 = textBuffer7.getCurrentSegment();
        char[] charArray13 = textBuffer7.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray13, (int) (byte) 100, 10);
        textBuffer1.setCurrentLength((int) (byte) -1);
        char[] charArray19 = textBuffer1.contentsAsArray();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        textBuffer1.append(' ');
        char[] charArray9 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str10 = textBuffer1.toString();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal12 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithString("hi!");
        // The following exception was thrown during execution in test generation
        try {
            double double9 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        textBuffer6.setCurrentLength(1);
        char[] charArray9 = textBuffer6.getCurrentSegment();
        char[] charArray10 = textBuffer6.contentsAsArray();
        char[] charArray11 = textBuffer6.getTextBuffer();
        textBuffer1.resetWithShared(charArray11, 100, (int) (byte) 0);
        textBuffer1.releaseBuffers();
        int int16 = textBuffer1.getCurrentSegmentSize();
        char[] charArray17 = textBuffer1.getCurrentSegment();
        textBuffer1.setCurrentLength(10);
        textBuffer1.resetWithString(" ");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer23 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler22);
        textBuffer23.setCurrentLength(1);
        char[] charArray26 = textBuffer23.getCurrentSegment();
        char[] charArray27 = textBuffer23.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray27, 1000, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 1010 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] {});
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        char[] charArray11 = textBuffer1.contentsAsArray();
        textBuffer1.releaseBuffers();
        char[] charArray14 = textBuffer1.expandCurrentSegment(0);
        int int15 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000", (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 52, end 52, length 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        char[] charArray6 = textBuffer1.getTextBuffer();
        textBuffer1.releaseBuffers();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        textBuffer9.releaseBuffers();
        char[] charArray11 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer9.resetWithShared(charArray11, (int) '#', (int) (byte) 10);
        textBuffer9.resetWithString("");
        boolean boolean17 = textBuffer9.hasTextAsCharacters();
        int int18 = textBuffer9.size();
        char[] charArray19 = textBuffer9.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        textBuffer21.setCurrentLength(1);
        boolean boolean24 = textBuffer21.hasTextAsCharacters();
        int int25 = textBuffer21.getTextOffset();
        char[] charArray26 = textBuffer21.emptyAndGetCurrentSegment();
        textBuffer9.resetWithShared(charArray26, (int) (short) 0, (int) (byte) 10);
        textBuffer1.resetWithCopy(charArray26, 2, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal33 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"??????????\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(charArray26);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        textBuffer1.releaseBuffers();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        char[] charArray16 = textBuffer15.getCurrentSegment();
        char[] charArray18 = textBuffer15.expandCurrentSegment((int) (byte) 1);
        char[] charArray19 = textBuffer15.emptyAndGetCurrentSegment();
        boolean boolean20 = textBuffer15.hasTextAsCharacters();
        textBuffer15.releaseBuffers();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer23 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler22);
        textBuffer23.setCurrentLength(1);
        boolean boolean26 = textBuffer23.hasTextAsCharacters();
        int int27 = textBuffer23.getCurrentSegmentSize();
        char[] charArray28 = textBuffer23.getTextBuffer();
        char[] charArray29 = textBuffer23.emptyAndGetCurrentSegment();
        textBuffer15.resetWithShared(charArray29, 100, 0);
        textBuffer1.resetWithShared(charArray29, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray36 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNull(charArray28);
        org.junit.Assert.assertNotNull(charArray29);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.append('a');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        char[] charArray11 = textBuffer10.getCurrentSegment();
        char[] charArray12 = textBuffer10.getCurrentSegment();
        textBuffer10.append(' ');
        java.lang.String str15 = textBuffer10.contentsAsString();
        char[] charArray16 = textBuffer10.emptyAndGetCurrentSegment();
        char[] charArray17 = textBuffer10.getCurrentSegment();
        char[] charArray18 = textBuffer10.getCurrentSegment();
        textBuffer1.resetWithShared(charArray18, 97, 35);
        int int22 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            double double23 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " " + "'", str15, " ");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler13 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer14 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler13);
        textBuffer14.setCurrentLength(1);
        char[] charArray17 = textBuffer14.getCurrentSegment();
        boolean boolean18 = textBuffer14.hasTextAsCharacters();
        textBuffer14.append('a');
        boolean boolean21 = textBuffer14.hasTextAsCharacters();
        char[] charArray22 = textBuffer14.getCurrentSegment();
        boolean boolean23 = textBuffer14.hasTextAsCharacters();
        char[] charArray24 = textBuffer14.contentsAsArray();
        char[] charArray25 = textBuffer14.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray25, 262144, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { 'a' });
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.contentsAsArray();
        char[] charArray7 = textBuffer1.contentsAsArray();
        textBuffer1.append(' ');
        char[] charArray11 = textBuffer1.expandCurrentSegment(100);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertNotNull(charArray11);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        textBuffer1.append('#');
        textBuffer1.resetWithString("hi!");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        char[] charArray9 = textBuffer8.getCurrentSegment();
        char[] charArray11 = textBuffer8.expandCurrentSegment((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray11, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray11);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        textBuffer1.append(' ');
        textBuffer1.append(' ');
        java.lang.Class<?> wildcardClass8 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.append('a');
        char[] charArray9 = textBuffer1.getTextBuffer();
        textBuffer1.setCurrentLength(1000);
        char[] charArray12 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray12);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        textBuffer1.resetWithEmpty();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("a", (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 52, end 84, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000");
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray15 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        textBuffer1.resetWithEmpty();
        java.lang.String str6 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        textBuffer1.append('a');
        java.lang.String str6 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("hi!", 101, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 101, end 111, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        textBuffer1.setCurrentLength(97);
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        java.lang.String str3 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getTextBuffer();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray8 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        textBuffer10.setCurrentLength(1);
        char[] charArray13 = textBuffer10.getCurrentSegment();
        boolean boolean14 = textBuffer10.hasTextAsCharacters();
        textBuffer10.append('a');
        boolean boolean17 = textBuffer10.hasTextAsCharacters();
        char[] charArray18 = textBuffer10.getCurrentSegment();
        boolean boolean19 = textBuffer10.hasTextAsCharacters();
        char[] charArray20 = textBuffer10.contentsAsArray();
        int int21 = textBuffer10.getCurrentSegmentSize();
        textBuffer10.resetWithString(" ");
        char[] charArray25 = textBuffer10.expandCurrentSegment(10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer27 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler26);
        char[] charArray28 = textBuffer27.getCurrentSegment();
        char[] charArray30 = textBuffer27.expandCurrentSegment((int) (byte) 1);
        char[] charArray31 = textBuffer27.emptyAndGetCurrentSegment();
        boolean boolean32 = textBuffer27.hasTextAsCharacters();
        textBuffer27.releaseBuffers();
        boolean boolean34 = textBuffer27.hasTextAsCharacters();
        char[] charArray35 = textBuffer27.contentsAsArray();
        char[] charArray37 = textBuffer27.expandCurrentSegment((int) (short) 1);
        textBuffer10.append(charArray37, 10, (int) (short) 10);
        textBuffer1.append(charArray37, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("4", 3, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 3, end 2, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] {});
        org.junit.Assert.assertNotNull(charArray37);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        java.lang.String str6 = textBuffer1.contentsAsString();
        textBuffer1.append('a');
        char[] charArray10 = textBuffer1.expandCurrentSegment((int) 'a');
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 10, end 10, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        char[] charArray11 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray12 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        int int3 = textBuffer1.getTextOffset();
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithEmpty();
        int int6 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000", (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        char[] charArray7 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        java.lang.String str9 = textBuffer1.toString();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        int int5 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal6 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"hi!\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", 10, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 10, end 13, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        int int12 = textBuffer1.getTextOffset();
        char[] charArray13 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        int int7 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        char[] charArray10 = textBuffer9.getCurrentSegment();
        char[] charArray12 = textBuffer9.expandCurrentSegment((int) (byte) 1);
        char[] charArray13 = textBuffer9.emptyAndGetCurrentSegment();
        boolean boolean14 = textBuffer9.hasTextAsCharacters();
        textBuffer9.releaseBuffers();
        boolean boolean16 = textBuffer9.hasTextAsCharacters();
        char[] charArray17 = textBuffer9.contentsAsArray();
        char[] charArray18 = textBuffer9.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray18, 1000, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 1100 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        textBuffer1.resetWithString("hi!");
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        textBuffer9.setCurrentLength(1);
        char[] charArray12 = textBuffer9.getCurrentSegment();
        boolean boolean13 = textBuffer9.hasTextAsCharacters();
        textBuffer9.append('a');
        boolean boolean16 = textBuffer9.hasTextAsCharacters();
        char[] charArray17 = textBuffer9.getCurrentSegment();
        boolean boolean18 = textBuffer9.hasTextAsCharacters();
        char[] charArray19 = textBuffer9.contentsAsArray();
        int int20 = textBuffer9.getCurrentSegmentSize();
        textBuffer9.resetWithString(" ");
        char[] charArray24 = textBuffer9.expandCurrentSegment(10);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray24, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(charArray24);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.append('a');
        char[] charArray10 = textBuffer1.expandCurrentSegment((int) '4');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        textBuffer12.setCurrentLength(1);
        boolean boolean15 = textBuffer12.hasTextAsCharacters();
        int int16 = textBuffer12.getTextOffset();
        char[] charArray17 = textBuffer12.contentsAsArray();
        char[] charArray18 = textBuffer12.contentsAsArray();
        textBuffer12.setCurrentLength(10);
        char[] charArray21 = textBuffer12.getCurrentSegment();
        textBuffer1.append(charArray21, (int) (short) 1, 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertNotNull(charArray21);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.append('a');
        char[] charArray9 = textBuffer1.getCurrentSegment();
        java.lang.Class<?> wildcardClass10 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        textBuffer1.append(' ');
        java.lang.String str6 = textBuffer1.contentsAsString();
        textBuffer1.append('#');
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000", (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 32, end 42, length 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        textBuffer1.setCurrentLength((int) (byte) 100);
        int int12 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal13 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        textBuffer4.setCurrentLength(1);
        char[] charArray7 = textBuffer4.getCurrentSegment();
        boolean boolean8 = textBuffer4.hasTextAsCharacters();
        char[] charArray9 = textBuffer4.getCurrentSegment();
        textBuffer1.resetWithShared(charArray9, 1, (int) '#');
        char[] charArray13 = textBuffer1.getCurrentSegment();
        char[] charArray14 = textBuffer1.contentsAsArray();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray14);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal7 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        int int11 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        textBuffer13.releaseBuffers();
        char[] charArray15 = textBuffer13.getCurrentSegment();
        textBuffer1.resetWithShared(charArray15, (int) 'a', 0);
        boolean boolean19 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        java.lang.Class<?> wildcardClass21 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        char[] charArray7 = textBuffer1.contentsAsArray();
        int int8 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal9 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        int int11 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        textBuffer13.releaseBuffers();
        char[] charArray15 = textBuffer13.getCurrentSegment();
        textBuffer1.resetWithShared(charArray15, (int) 'a', 0);
        boolean boolean19 = textBuffer1.hasTextAsCharacters();
        boolean boolean20 = textBuffer1.hasTextAsCharacters();
        java.lang.String str21 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("a", (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 0, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (short) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        char[] charArray13 = textBuffer12.getCurrentSegment();
        char[] charArray15 = textBuffer12.expandCurrentSegment((int) (byte) 1);
        java.lang.String str16 = textBuffer12.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        char[] charArray19 = textBuffer18.getCurrentSegment();
        char[] charArray20 = textBuffer18.getCurrentSegment();
        textBuffer12.resetWithCopy(charArray20, (int) '4', 1);
        textBuffer1.resetWithShared(charArray20, (int) (byte) 100, (int) (short) 10);
        char[] charArray27 = textBuffer1.contentsAsArray();
        textBuffer1.append(' ');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler30 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer31 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler30);
        textBuffer31.setCurrentLength(1);
        boolean boolean34 = textBuffer31.hasTextAsCharacters();
        int int35 = textBuffer31.getTextOffset();
        char[] charArray36 = textBuffer31.contentsAsArray();
        char[] charArray37 = textBuffer31.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler38 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer39 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler38);
        textBuffer39.releaseBuffers();
        char[] charArray41 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer39.resetWithShared(charArray41, (int) '#', (int) (byte) 10);
        textBuffer39.resetWithString("");
        boolean boolean47 = textBuffer39.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler48 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer49 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler48);
        textBuffer49.setCurrentLength(1);
        char[] charArray52 = textBuffer49.getCurrentSegment();
        boolean boolean53 = textBuffer49.hasTextAsCharacters();
        textBuffer49.append('a');
        char[] charArray56 = textBuffer49.emptyAndGetCurrentSegment();
        char[] charArray57 = textBuffer49.getCurrentSegment();
        textBuffer39.resetWithCopy(charArray57, (int) (short) 0, (int) (short) 0);
        textBuffer31.resetWithCopy(charArray57, (int) '#', (int) (byte) 1);
        textBuffer1.resetWithCopy(charArray57, (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] {});
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] {});
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertNotNull(charArray57);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        int int10 = textBuffer1.getTextOffset();
        textBuffer1.setCurrentLength(1);
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithString("");
        java.lang.Class<?> wildcardClass16 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getTextBuffer();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray13 = new char[] { 'a', '#', ' ', '#', '#' };
        textBuffer1.resetWithShared(charArray13, 1000, 262144);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray17 = textBuffer1.contentsAsArray();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -995 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { 'a', '#', ' ', '#', '#' });
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        char[] charArray9 = textBuffer1.getTextBuffer();
        char[] charArray10 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 0, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 1000, length 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        textBuffer8.releaseBuffers();
        int int10 = textBuffer8.getTextOffset();
        textBuffer8.ensureNotShared();
        textBuffer8.resetWithEmpty();
        java.lang.String str13 = textBuffer8.contentsAsString();
        char[] charArray14 = textBuffer8.getTextBuffer();
        char[] charArray15 = textBuffer8.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer17 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler16);
        textBuffer17.setCurrentLength(1);
        boolean boolean20 = textBuffer17.hasTextAsCharacters();
        int int21 = textBuffer17.getTextOffset();
        char[] charArray22 = textBuffer17.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer24 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler23);
        textBuffer24.releaseBuffers();
        char[] charArray26 = textBuffer24.getCurrentSegment();
        textBuffer17.resetWithCopy(charArray26, 97, 100);
        textBuffer8.resetWithShared(charArray26, 100, 0);
        textBuffer1.append(charArray26, (int) (byte) 1, 35);
        java.lang.Class<?> wildcardClass36 = charArray26.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        textBuffer1.append('#');
        textBuffer1.resetWithString("hi!");
        // The following exception was thrown during execution in test generation
        try {
            double double7 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        int int7 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.releaseBuffers();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        textBuffer1.ensureNotShared();
        int int11 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler13 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer14 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler13);
        char[] charArray15 = textBuffer14.getCurrentSegment();
        char[] charArray17 = textBuffer14.expandCurrentSegment((int) (byte) 1);
        textBuffer14.resetWithString("hi!");
        textBuffer14.releaseBuffers();
        int int21 = textBuffer14.size();
        char[] charArray23 = textBuffer14.expandCurrentSegment(1000);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray23, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(charArray23);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        char[] charArray10 = textBuffer1.getTextBuffer();
        char[] charArray11 = textBuffer1.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("hi!", (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 100, end 132, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray11);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        char[] charArray8 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        java.lang.Class<?> wildcardClass10 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", 0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        java.lang.String str4 = textBuffer1.toString();
        textBuffer1.resetWithString("hi!");
        int int7 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getTextBuffer();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray13 = new char[] { 'a', '#', ' ', '#', '#' };
        textBuffer1.resetWithShared(charArray13, 1000, 262144);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        textBuffer18.releaseBuffers();
        char[] charArray20 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer18.resetWithShared(charArray20, (int) '#', (int) (byte) 10);
        textBuffer18.resetWithString("");
        boolean boolean26 = textBuffer18.hasTextAsCharacters();
        int int27 = textBuffer18.size();
        char[] charArray28 = textBuffer18.contentsAsArray();
        textBuffer18.resetWithString("hi!");
        java.lang.String str31 = textBuffer18.toString();
        char[] charArray32 = textBuffer18.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray32, 1000, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 1003 out of bounds for char[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { 'a', '#', ' ', '#', '#' });
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { 'h', 'i', '!' });
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        java.lang.String str6 = textBuffer1.contentsAsString();
        textBuffer1.append('a');
        char[] charArray10 = textBuffer1.expandCurrentSegment((int) 'a');
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        char[] charArray13 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray13);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        java.lang.String str4 = textBuffer1.toString();
        textBuffer1.resetWithEmpty();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        textBuffer1.resetWithEmpty();
        java.lang.Class<?> wildcardClass8 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        char[] charArray5 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        textBuffer7.releaseBuffers();
        char[] charArray9 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer7.resetWithShared(charArray9, (int) '#', (int) (byte) 10);
        textBuffer7.resetWithString("");
        boolean boolean15 = textBuffer7.hasTextAsCharacters();
        int int16 = textBuffer7.size();
        textBuffer7.releaseBuffers();
        int int18 = textBuffer7.getTextOffset();
        char[] charArray19 = textBuffer7.contentsAsArray();
        textBuffer1.resetWithShared(charArray19, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("a", (int) ' ', 101);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 32, end 133, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        char[] charArray9 = textBuffer1.getTextBuffer();
        char[] charArray10 = textBuffer1.getCurrentSegment();
        boolean boolean11 = textBuffer1.hasTextAsCharacters();
        int int12 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler13 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer14 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler13);
        textBuffer14.releaseBuffers();
        char[] charArray16 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer14.resetWithShared(charArray16, (int) '#', (int) (byte) 10);
        textBuffer14.resetWithString("");
        boolean boolean22 = textBuffer14.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer24 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler23);
        textBuffer24.setCurrentLength(1);
        char[] charArray27 = textBuffer24.getCurrentSegment();
        boolean boolean28 = textBuffer24.hasTextAsCharacters();
        textBuffer24.append('a');
        char[] charArray31 = textBuffer24.emptyAndGetCurrentSegment();
        char[] charArray32 = textBuffer24.getCurrentSegment();
        textBuffer14.resetWithCopy(charArray32, (int) (short) 0, (int) (short) 0);
        java.lang.String str36 = textBuffer14.contentsAsString();
        textBuffer14.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler38 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer39 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler38);
        textBuffer39.releaseBuffers();
        char[] charArray41 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer39.resetWithShared(charArray41, (int) '#', (int) (byte) 10);
        textBuffer39.resetWithString("");
        boolean boolean47 = textBuffer39.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler48 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer49 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler48);
        textBuffer49.setCurrentLength(1);
        char[] charArray52 = textBuffer49.getCurrentSegment();
        boolean boolean53 = textBuffer49.hasTextAsCharacters();
        textBuffer49.append('a');
        char[] charArray56 = textBuffer49.emptyAndGetCurrentSegment();
        char[] charArray57 = textBuffer49.getCurrentSegment();
        textBuffer39.resetWithCopy(charArray57, (int) (short) 0, (int) (short) 0);
        textBuffer14.resetWithCopy(charArray57, 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray57, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertNotNull(charArray57);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.setCurrentLength(262144);
        textBuffer1.setCurrentLength((int) (short) 10);
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal13 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getTextBuffer();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray8 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithString(" ");
        char[] charArray11 = textBuffer1.emptyAndGetCurrentSegment();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(charArray11);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        textBuffer4.setCurrentLength(1);
        char[] charArray7 = textBuffer4.getCurrentSegment();
        boolean boolean8 = textBuffer4.hasTextAsCharacters();
        char[] charArray9 = textBuffer4.getCurrentSegment();
        textBuffer1.resetWithShared(charArray9, 1, (int) '#');
        char[] charArray13 = textBuffer1.getCurrentSegment();
        boolean boolean14 = textBuffer1.hasTextAsCharacters();
        int int15 = textBuffer1.size();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        char[] charArray5 = textBuffer1.getCurrentSegment();
        java.lang.String str6 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal7 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        char[] charArray10 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -1, end 0, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        char[] charArray11 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithString("hi!");
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray15 = textBuffer1.expandCurrentSegment(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.size();
        int int3 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal4 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        char[] charArray10 = textBuffer1.getTextBuffer();
        char[] charArray12 = textBuffer1.expandCurrentSegment((int) (short) 100);
        java.lang.Class<?> wildcardClass13 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.append('a');
        char[] charArray9 = textBuffer1.getTextBuffer();
        textBuffer1.setCurrentLength(1000);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        textBuffer13.releaseBuffers();
        char[] charArray15 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer13.resetWithShared(charArray15, (int) '#', (int) (byte) 10);
        textBuffer13.resetWithString("");
        boolean boolean21 = textBuffer13.hasTextAsCharacters();
        int int22 = textBuffer13.size();
        char[] charArray23 = textBuffer13.contentsAsArray();
        textBuffer1.resetWithShared(charArray23, 1, 0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer28 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler27);
        textBuffer28.setCurrentLength(1);
        char[] charArray31 = textBuffer28.getCurrentSegment();
        boolean boolean32 = textBuffer28.hasTextAsCharacters();
        textBuffer28.append('a');
        boolean boolean35 = textBuffer28.hasTextAsCharacters();
        char[] charArray36 = textBuffer28.getCurrentSegment();
        boolean boolean37 = textBuffer28.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler38 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer39 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler38);
        textBuffer39.releaseBuffers();
        char[] charArray41 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer39.resetWithShared(charArray41, (int) '#', (int) (byte) 10);
        textBuffer39.resetWithString("");
        boolean boolean47 = textBuffer39.hasTextAsCharacters();
        char[] charArray48 = textBuffer39.emptyAndGetCurrentSegment();
        textBuffer28.append(charArray48, (int) (short) 10, (int) (short) 1);
        textBuffer28.resetWithString("");
        textBuffer28.resetWithEmpty();
        char[] charArray55 = textBuffer28.emptyAndGetCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray55, 262144, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 262244 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertNotNull(charArray55);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        java.lang.String str10 = textBuffer1.toString();
        int int11 = textBuffer1.getTextOffset();
        int int12 = textBuffer1.size();
        int int13 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal14 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        char[] charArray7 = textBuffer1.getCurrentSegment();
        int int8 = textBuffer1.getTextOffset();
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("a", (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 97, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        int int11 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        char[] charArray7 = textBuffer1.contentsAsArray();
        char[] charArray8 = textBuffer1.contentsAsArray();
        textBuffer1.append('4');
        textBuffer1.resetWithEmpty();
        java.lang.String str12 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal13 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        java.lang.Class<?> wildcardClass4 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        int int5 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        textBuffer7.setCurrentLength(1);
        char[] charArray10 = textBuffer7.getCurrentSegment();
        boolean boolean11 = textBuffer7.hasTextAsCharacters();
        textBuffer7.append('a');
        boolean boolean14 = textBuffer7.hasTextAsCharacters();
        char[] charArray15 = textBuffer7.getCurrentSegment();
        boolean boolean16 = textBuffer7.hasTextAsCharacters();
        int int17 = textBuffer7.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler18 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer19 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler18);
        textBuffer19.releaseBuffers();
        char[] charArray21 = textBuffer19.getCurrentSegment();
        textBuffer7.resetWithShared(charArray21, (int) 'a', 0);
        char[] charArray25 = textBuffer7.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray25, (int) (short) 0, (-1));
        textBuffer1.releaseBuffers();
        int int30 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("hi!");
        java.lang.String str5 = textBuffer1.toString();
        char[] charArray7 = textBuffer1.expandCurrentSegment((int) (byte) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        textBuffer9.releaseBuffers();
        textBuffer9.resetWithString("hi!");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler13 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer14 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler13);
        textBuffer14.setCurrentLength(1);
        char[] charArray17 = textBuffer14.getCurrentSegment();
        char[] charArray18 = textBuffer14.contentsAsArray();
        char[] charArray19 = textBuffer14.getTextBuffer();
        textBuffer9.resetWithShared(charArray19, 100, (int) (byte) 0);
        textBuffer1.resetWithShared(charArray19, 262144, (int) (byte) 10);
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        textBuffer1.append('a');
        java.lang.String str6 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        textBuffer10.setCurrentLength(1);
        char[] charArray13 = textBuffer10.getCurrentSegment();
        boolean boolean14 = textBuffer10.hasTextAsCharacters();
        textBuffer10.append('a');
        boolean boolean17 = textBuffer10.hasTextAsCharacters();
        char[] charArray18 = textBuffer10.getCurrentSegment();
        boolean boolean19 = textBuffer10.hasTextAsCharacters();
        char[] charArray20 = textBuffer10.contentsAsArray();
        char[] charArray21 = textBuffer10.contentsAsArray();
        textBuffer1.resetWithShared(charArray21, 1, 0);
        boolean boolean25 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        textBuffer1.resetWithString("hi!");
        textBuffer1.releaseBuffers();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        char[] charArray11 = textBuffer10.getCurrentSegment();
        char[] charArray13 = textBuffer10.expandCurrentSegment((int) (byte) 1);
        java.lang.String str14 = textBuffer10.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        char[] charArray17 = textBuffer16.getCurrentSegment();
        char[] charArray18 = textBuffer16.getCurrentSegment();
        textBuffer10.resetWithCopy(charArray18, (int) '4', 1);
        textBuffer1.append(charArray18, (int) (short) 0, 3);
        char[] charArray25 = textBuffer1.getCurrentSegment();
        int int26 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer28 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler27);
        textBuffer28.releaseBuffers();
        char[] charArray30 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer28.resetWithShared(charArray30, (int) '#', (int) (byte) 10);
        textBuffer28.resetWithString("");
        char[] charArray36 = textBuffer28.getTextBuffer();
        char[] charArray37 = textBuffer28.getCurrentSegment();
        textBuffer1.resetWithShared(charArray37, 100, (int) '#');
        java.lang.Class<?> wildcardClass41 = charArray37.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] {});
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        java.lang.String str11 = textBuffer1.toString();
        int int12 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        int int12 = textBuffer1.getTextOffset();
        textBuffer1.setCurrentLength((int) (byte) 100);
        char[] charArray15 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        char[] charArray19 = textBuffer18.getCurrentSegment();
        char[] charArray20 = textBuffer18.getCurrentSegment();
        textBuffer18.append(' ');
        java.lang.String str23 = textBuffer18.contentsAsString();
        char[] charArray24 = textBuffer18.emptyAndGetCurrentSegment();
        textBuffer1.append(charArray24, (int) (short) 100, (int) (short) 0);
        boolean boolean28 = textBuffer1.hasTextAsCharacters();
        java.lang.Class<?> wildcardClass29 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " " + "'", str23, " ");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = textBuffer1.contentsAsArray();
        java.lang.Class<?> wildcardClass4 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        char[] charArray9 = textBuffer1.contentsAsArray();
        int int10 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray13 = textBuffer1.expandCurrentSegment(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        char[] charArray11 = textBuffer1.contentsAsArray();
        int int12 = textBuffer1.getCurrentSegmentSize();
        int int13 = textBuffer1.getTextOffset();
        java.lang.String str14 = textBuffer1.toString();
        char[] charArray15 = textBuffer1.getTextBuffer();
        java.lang.Class<?> wildcardClass16 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "a" + "'", str14, "a");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { 'a' });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        boolean boolean11 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal12 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"a\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        char[] charArray7 = textBuffer1.contentsAsArray();
        char[] charArray8 = textBuffer1.contentsAsArray();
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal10 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.append('a');
        char[] charArray9 = null;
        textBuffer1.resetWithShared(charArray9, 35, (int) (short) 10);
        char[] charArray14 = textBuffer1.expandCurrentSegment((int) (short) 0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        char[] charArray17 = textBuffer16.getCurrentSegment();
        char[] charArray18 = textBuffer16.getCurrentSegment();
        textBuffer16.append(' ');
        java.lang.String str21 = textBuffer16.contentsAsString();
        char[] charArray22 = textBuffer16.emptyAndGetCurrentSegment();
        char[] charArray23 = textBuffer16.getCurrentSegment();
        char[] charArray24 = textBuffer16.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray24, 262144, 262144);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 263144 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " " + "'", str21, " ");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray24);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        textBuffer1.append("hi!", 0, 0);
        java.lang.String str12 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        char[] charArray7 = textBuffer1.contentsAsArray();
        char[] charArray8 = textBuffer1.contentsAsArray();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        textBuffer11.releaseBuffers();
        char[] charArray13 = textBuffer11.contentsAsArray();
        textBuffer11.resetWithEmpty();
        int int15 = textBuffer11.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer17 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler16);
        textBuffer17.setCurrentLength(1);
        char[] charArray20 = textBuffer17.getCurrentSegment();
        boolean boolean21 = textBuffer17.hasTextAsCharacters();
        textBuffer17.append('a');
        boolean boolean24 = textBuffer17.hasTextAsCharacters();
        char[] charArray25 = textBuffer17.getCurrentSegment();
        boolean boolean26 = textBuffer17.hasTextAsCharacters();
        int int27 = textBuffer17.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler28 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer29 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler28);
        textBuffer29.releaseBuffers();
        char[] charArray31 = textBuffer29.getCurrentSegment();
        textBuffer17.resetWithShared(charArray31, (int) 'a', 0);
        char[] charArray35 = textBuffer17.emptyAndGetCurrentSegment();
        textBuffer11.resetWithShared(charArray35, (int) (short) 0, (-1));
        textBuffer1.resetWithShared(charArray35, 100, (int) (byte) 1);
        textBuffer1.setCurrentLength((int) (byte) 100);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler44 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer45 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler44);
        textBuffer45.releaseBuffers();
        char[] charArray47 = textBuffer45.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray47, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", 101, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 101, end 100, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertNotNull(charArray47);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        java.lang.String str4 = textBuffer1.toString();
        textBuffer1.resetWithEmpty();
        char[] charArray6 = textBuffer1.getTextBuffer();
        java.lang.Class<?> wildcardClass7 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        char[] charArray9 = textBuffer1.getTextBuffer();
        char[] charArray10 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithString("");
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("hi!", 3, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 3, end 1003, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.setCurrentLength(262144);
        textBuffer1.setCurrentLength((int) (short) 10);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler13 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer14 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler13);
        textBuffer14.setCurrentLength(1);
        boolean boolean17 = textBuffer14.hasTextAsCharacters();
        int int18 = textBuffer14.getCurrentSegmentSize();
        char[] charArray19 = textBuffer14.getTextBuffer();
        char[] charArray20 = textBuffer14.emptyAndGetCurrentSegment();
        char[] charArray21 = textBuffer14.contentsAsArray();
        textBuffer1.resetWithShared(charArray21, (int) (short) 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal25 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 0, count -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(charArray19);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] {});
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        int int7 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray10 = textBuffer1.getCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 45 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray10 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        textBuffer1.setCurrentLength((int) (short) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        char[] charArray13 = textBuffer12.getCurrentSegment();
        char[] charArray15 = textBuffer12.expandCurrentSegment((int) (byte) 1);
        java.lang.String str16 = textBuffer12.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer18 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler17);
        char[] charArray19 = textBuffer18.getCurrentSegment();
        char[] charArray20 = textBuffer18.getCurrentSegment();
        textBuffer12.resetWithCopy(charArray20, (int) '4', 1);
        textBuffer1.resetWithShared(charArray20, (int) (byte) 100, (int) (short) 10);
        char[] charArray27 = textBuffer1.contentsAsArray();
        textBuffer1.append(' ');
        char[] charArray31 = textBuffer1.expandCurrentSegment(97);
        int int32 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler33 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer34 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler33);
        char[] charArray35 = textBuffer34.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray35, (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 53 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 11 + "'", int32 == 11);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] {});
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        char[] charArray7 = textBuffer1.contentsAsArray();
        int int8 = textBuffer1.size();
        java.lang.Class<?> wildcardClass9 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        textBuffer6.setCurrentLength(1);
        char[] charArray9 = textBuffer6.getCurrentSegment();
        char[] charArray10 = textBuffer6.contentsAsArray();
        char[] charArray11 = textBuffer6.getTextBuffer();
        textBuffer1.resetWithShared(charArray11, 100, (int) (byte) 0);
        textBuffer1.releaseBuffers();
        int int16 = textBuffer1.getCurrentSegmentSize();
        char[] charArray17 = textBuffer1.getCurrentSegment();
        textBuffer1.append('4');
        java.lang.Class<?> wildcardClass20 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        char[] charArray9 = textBuffer1.getTextBuffer();
        int int10 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        int int12 = textBuffer1.size();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal8 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 35, count 10, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        char[] charArray7 = textBuffer1.contentsAsArray();
        char[] charArray8 = textBuffer1.contentsAsArray();
        textBuffer1.append('4');
        textBuffer1.resetWithEmpty();
        java.lang.String str12 = textBuffer1.contentsAsString();
        java.lang.String str13 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal14 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        char[] charArray13 = textBuffer12.getCurrentSegment();
        textBuffer12.resetWithString("hi!");
        java.lang.String str16 = textBuffer12.toString();
        java.lang.String str17 = textBuffer12.contentsAsString();
        int int18 = textBuffer12.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler19 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer20 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler19);
        textBuffer20.releaseBuffers();
        char[] charArray22 = textBuffer20.contentsAsArray();
        textBuffer12.resetWithShared(charArray22, (int) (byte) -1, 262144);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray22, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 100 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        char[] charArray9 = textBuffer1.getTextBuffer();
        char[] charArray10 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        textBuffer1.setCurrentLength(3);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        char[] charArray17 = textBuffer16.getCurrentSegment();
        char[] charArray19 = textBuffer16.expandCurrentSegment((int) (byte) 1);
        char[] charArray20 = textBuffer16.emptyAndGetCurrentSegment();
        textBuffer1.resetWithShared(charArray20, 0, 35);
        textBuffer1.setCurrentLength((int) (short) -1);
        textBuffer1.resetWithString("4");
        char[] charArray28 = null;
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray28, 2, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray20);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        char[] charArray9 = textBuffer1.contentsAsArray();
        textBuffer1.ensureNotShared();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        textBuffer13.releaseBuffers();
        char[] charArray15 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer13.resetWithShared(charArray15, (int) '#', (int) (byte) 10);
        textBuffer13.resetWithString("");
        boolean boolean21 = textBuffer13.hasTextAsCharacters();
        char[] charArray22 = textBuffer13.emptyAndGetCurrentSegment();
        char[] charArray23 = textBuffer13.getTextBuffer();
        textBuffer1.resetWithCopy(charArray23, 0, (int) '4');
        char[] charArray27 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.setCurrentLength(262144);
        // The following exception was thrown during execution in test generation
        try {
            double double30 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 0, count 262144, length 1000");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray27);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        char[] charArray10 = textBuffer1.emptyAndGetCurrentSegment();
        int int11 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000", (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 35, end 36, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.append('a');
        char[] charArray9 = null;
        textBuffer1.resetWithShared(charArray9, 35, (int) (short) 10);
        char[] charArray14 = textBuffer1.expandCurrentSegment((int) (short) 0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        textBuffer16.setCurrentLength(1);
        boolean boolean19 = textBuffer16.hasTextAsCharacters();
        int int20 = textBuffer16.getCurrentSegmentSize();
        char[] charArray21 = textBuffer16.getTextBuffer();
        char[] charArray22 = textBuffer16.emptyAndGetCurrentSegment();
        char[] charArray23 = textBuffer16.contentsAsArray();
        textBuffer16.resetWithString(" ");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler26 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer27 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler26);
        char[] charArray28 = textBuffer27.getCurrentSegment();
        textBuffer27.resetWithString("hi!");
        java.lang.String str31 = textBuffer27.toString();
        java.lang.String str32 = textBuffer27.contentsAsString();
        char[] charArray34 = textBuffer27.expandCurrentSegment((int) (short) 1);
        char[] charArray35 = textBuffer27.emptyAndGetCurrentSegment();
        textBuffer16.resetWithShared(charArray35, (int) (byte) 10, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray35, 101, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(charArray21);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertNotNull(charArray35);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        char[] charArray9 = textBuffer1.contentsAsArray();
        java.lang.Class<?> wildcardClass10 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        int int5 = textBuffer1.getCurrentSegmentSize();
        java.lang.String str6 = textBuffer1.toString();
        java.lang.String str7 = textBuffer1.contentsAsString();
        java.lang.String str8 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        char[] charArray11 = textBuffer10.getCurrentSegment();
        char[] charArray12 = textBuffer10.getCurrentSegment();
        textBuffer10.append(' ');
        textBuffer10.append(' ');
        char[] charArray17 = textBuffer10.emptyAndGetCurrentSegment();
        char[] charArray19 = textBuffer10.expandCurrentSegment((int) ' ');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        textBuffer21.setCurrentLength(1);
        boolean boolean24 = textBuffer21.hasTextAsCharacters();
        int int25 = textBuffer21.getTextOffset();
        char[] charArray26 = textBuffer21.contentsAsArray();
        char[] charArray27 = textBuffer21.contentsAsArray();
        textBuffer21.setCurrentLength(10);
        char[] charArray30 = textBuffer21.getCurrentSegment();
        textBuffer10.resetWithCopy(charArray30, 11, (int) (short) 1);
        textBuffer1.resetWithShared(charArray30, (-1), (int) (short) 100);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] {});
        org.junit.Assert.assertNotNull(charArray30);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        char[] charArray7 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal10 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.append('a');
        char[] charArray9 = null;
        textBuffer1.resetWithShared(charArray9, 35, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        int int7 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.releaseBuffers();
        int int9 = textBuffer1.getTextOffset();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        textBuffer4.setCurrentLength(1);
        char[] charArray7 = textBuffer4.getCurrentSegment();
        char[] charArray8 = textBuffer4.contentsAsArray();
        int int9 = textBuffer4.getTextOffset();
        int int10 = textBuffer4.getCurrentSegmentSize();
        textBuffer4.releaseBuffers();
        char[] charArray12 = textBuffer4.getCurrentSegment();
        textBuffer4.releaseBuffers();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        textBuffer15.releaseBuffers();
        char[] charArray17 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer15.resetWithShared(charArray17, (int) '#', (int) (byte) 10);
        textBuffer15.resetWithString("");
        textBuffer15.releaseBuffers();
        char[] charArray24 = textBuffer15.contentsAsArray();
        textBuffer4.resetWithShared(charArray24, (int) (byte) 10, 101);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray24, 35, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 45 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] {});
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        int int3 = textBuffer1.getTextOffset();
        textBuffer1.ensureNotShared();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("", (int) (byte) 1, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.append('a');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        char[] charArray11 = textBuffer10.getCurrentSegment();
        char[] charArray12 = textBuffer10.getCurrentSegment();
        textBuffer10.append(' ');
        java.lang.String str15 = textBuffer10.contentsAsString();
        char[] charArray16 = textBuffer10.emptyAndGetCurrentSegment();
        char[] charArray17 = textBuffer10.getCurrentSegment();
        char[] charArray18 = textBuffer10.getCurrentSegment();
        textBuffer1.resetWithShared(charArray18, 97, 35);
        int int22 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer24 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler23);
        textBuffer24.setCurrentLength(1);
        boolean boolean27 = textBuffer24.hasTextAsCharacters();
        int int28 = textBuffer24.getTextOffset();
        char[] charArray29 = textBuffer24.contentsAsArray();
        char[] charArray30 = textBuffer24.contentsAsArray();
        textBuffer24.append(' ');
        char[] charArray34 = textBuffer24.expandCurrentSegment(100);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray34, (int) (short) -1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " " + "'", str15, " ");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertNotNull(charArray34);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray7 = textBuffer1.contentsAsArray();
        int int8 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        textBuffer10.setCurrentLength(1);
        boolean boolean13 = textBuffer10.hasTextAsCharacters();
        int int14 = textBuffer10.getCurrentSegmentSize();
        char[] charArray15 = textBuffer10.getCurrentSegment();
        textBuffer10.append('a');
        char[] charArray19 = textBuffer10.expandCurrentSegment((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray19, 262144, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 262154 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray19);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer6 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler5);
        char[] charArray7 = textBuffer6.getCurrentSegment();
        char[] charArray8 = textBuffer6.getCurrentSegment();
        java.lang.String str9 = textBuffer6.toString();
        textBuffer6.resetWithEmpty();
        char[] charArray11 = textBuffer6.getTextBuffer();
        textBuffer6.resetWithEmpty();
        char[] charArray13 = textBuffer6.getCurrentSegment();
        textBuffer1.append(charArray13, (int) (short) 10, 100);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray13);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        char[] charArray7 = textBuffer1.getCurrentSegment();
        int int8 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        java.lang.String str5 = textBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal6 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        char[] charArray10 = textBuffer9.getCurrentSegment();
        char[] charArray12 = textBuffer9.expandCurrentSegment((int) (byte) 1);
        char[] charArray13 = textBuffer9.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        textBuffer15.setCurrentLength(1);
        char[] charArray18 = textBuffer15.getCurrentSegment();
        boolean boolean19 = textBuffer15.hasTextAsCharacters();
        char[] charArray20 = textBuffer15.getCurrentSegment();
        char[] charArray21 = textBuffer15.getCurrentSegment();
        textBuffer9.resetWithCopy(charArray21, (int) (byte) 100, 10);
        char[] charArray25 = textBuffer9.contentsAsArray();
        char[] charArray26 = textBuffer9.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray26, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
        org.junit.Assert.assertNotNull(charArray26);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        int int12 = textBuffer1.getTextOffset();
        textBuffer1.setCurrentLength((int) (byte) 100);
        char[] charArray15 = textBuffer1.getCurrentSegment();
        int int16 = textBuffer1.size();
        textBuffer1.append(' ');
        java.lang.Class<?> wildcardClass19 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        textBuffer7.setCurrentLength(1);
        char[] charArray10 = textBuffer7.getCurrentSegment();
        boolean boolean11 = textBuffer7.hasTextAsCharacters();
        char[] charArray12 = textBuffer7.getCurrentSegment();
        char[] charArray13 = textBuffer7.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray13, (int) (byte) 100, 10);
        int int17 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength(262144);
        java.lang.Class<?> wildcardClass20 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        textBuffer7.setCurrentLength(1);
        char[] charArray10 = textBuffer7.getCurrentSegment();
        boolean boolean11 = textBuffer7.hasTextAsCharacters();
        char[] charArray12 = textBuffer7.getCurrentSegment();
        char[] charArray13 = textBuffer7.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray13, (int) (byte) 100, 10);
        textBuffer1.setCurrentLength((int) (byte) -1);
        char[] charArray19 = null;
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray19, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        char[] charArray9 = textBuffer1.getTextBuffer();
        char[] charArray10 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("");
        char[] charArray13 = textBuffer1.contentsAsArray();
        java.lang.String str14 = textBuffer1.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        textBuffer16.setCurrentLength(1);
        boolean boolean19 = textBuffer16.hasTextAsCharacters();
        int int20 = textBuffer16.getTextOffset();
        char[] charArray21 = textBuffer16.emptyAndGetCurrentSegment();
        textBuffer16.setCurrentLength(262144);
        textBuffer16.setCurrentLength((int) (short) 10);
        textBuffer16.releaseBuffers();
        char[] charArray28 = textBuffer16.expandCurrentSegment(100);
        char[] charArray29 = textBuffer16.contentsAsArray();
        textBuffer1.resetWithShared(charArray29, 1, 101);
        int int33 = textBuffer1.getTextOffset();
        char[] charArray35 = textBuffer1.expandCurrentSegment(1);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray36 = textBuffer1.contentsAsArray();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(charArray35);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        char[] charArray5 = textBuffer1.getCurrentSegment();
        java.lang.String str6 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        char[] charArray8 = textBuffer1.contentsAsArray();
        textBuffer1.ensureNotShared();
        textBuffer1.setCurrentLength(10);
        boolean boolean12 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithString("");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        char[] charArray17 = textBuffer16.getCurrentSegment();
        textBuffer16.resetWithString("hi!");
        java.lang.String str20 = textBuffer16.toString();
        textBuffer16.append('#');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer24 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler23);
        textBuffer24.releaseBuffers();
        char[] charArray26 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer24.resetWithShared(charArray26, (int) '#', (int) (byte) 10);
        textBuffer24.resetWithString("");
        boolean boolean32 = textBuffer24.hasTextAsCharacters();
        int int33 = textBuffer24.size();
        textBuffer24.releaseBuffers();
        int int35 = textBuffer24.getTextOffset();
        textBuffer24.setCurrentLength((int) (byte) 100);
        char[] charArray38 = textBuffer24.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler39 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer40 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler39);
        textBuffer40.releaseBuffers();
        char[] charArray42 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer40.resetWithShared(charArray42, (int) '#', (int) (byte) 10);
        textBuffer40.resetWithString("");
        char[] charArray48 = textBuffer40.getTextBuffer();
        char[] charArray49 = textBuffer40.getCurrentSegment();
        boolean boolean50 = textBuffer40.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler51 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer52 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler51);
        char[] charArray53 = textBuffer52.getCurrentSegment();
        char[] charArray54 = textBuffer52.getCurrentSegment();
        textBuffer52.append(' ');
        java.lang.String str57 = textBuffer52.contentsAsString();
        char[] charArray58 = textBuffer52.emptyAndGetCurrentSegment();
        textBuffer40.resetWithShared(charArray58, (int) (short) 1, (int) (byte) 10);
        textBuffer24.append(charArray58, 0, (int) (byte) 1);
        textBuffer16.resetWithShared(charArray58, (-1), 35);
        char[] charArray69 = textBuffer16.expandCurrentSegment(101);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray69, 35, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] {});
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] {});
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + " " + "'", str57, " ");
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertNotNull(charArray69);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        int int9 = textBuffer1.getCurrentSegmentSize();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        textBuffer11.releaseBuffers();
        char[] charArray13 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer11.resetWithShared(charArray13, (int) '#', (int) (byte) 10);
        textBuffer11.resetWithString("");
        char[] charArray19 = textBuffer11.getTextBuffer();
        char[] charArray20 = textBuffer11.getCurrentSegment();
        textBuffer11.resetWithString("");
        char[] charArray23 = textBuffer11.contentsAsArray();
        java.lang.String str24 = textBuffer11.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer26 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler25);
        textBuffer26.setCurrentLength(1);
        boolean boolean29 = textBuffer26.hasTextAsCharacters();
        int int30 = textBuffer26.getTextOffset();
        char[] charArray31 = textBuffer26.emptyAndGetCurrentSegment();
        textBuffer26.setCurrentLength(262144);
        textBuffer26.setCurrentLength((int) (short) 10);
        textBuffer26.releaseBuffers();
        char[] charArray38 = textBuffer26.expandCurrentSegment(100);
        char[] charArray39 = textBuffer26.contentsAsArray();
        textBuffer11.resetWithShared(charArray39, 1, 101);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray39, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 100 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] {});
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        textBuffer1.releaseBuffers();
        textBuffer1.setCurrentLength((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("4", 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        textBuffer1.setCurrentLength(97);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        textBuffer16.setCurrentLength(1);
        boolean boolean19 = textBuffer16.hasTextAsCharacters();
        int int20 = textBuffer16.getCurrentSegmentSize();
        char[] charArray21 = textBuffer16.getCurrentSegment();
        textBuffer16.resetWithString("");
        textBuffer16.resetWithEmpty();
        java.lang.String str25 = textBuffer16.toString();
        char[] charArray26 = textBuffer16.getTextBuffer();
        textBuffer1.resetWithShared(charArray26, (int) (byte) 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray30 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        char[] charArray11 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithString("hi!");
        java.lang.String str14 = textBuffer1.toString();
        char[] charArray15 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray17 = textBuffer1.expandCurrentSegment((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { 'h', 'i', '!' });
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.setCurrentLength(262144);
        textBuffer1.setCurrentLength((int) (short) 10);
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        boolean boolean13 = textBuffer1.hasTextAsCharacters();
        char[] charArray14 = textBuffer1.getCurrentSegment();
        java.lang.Class<?> wildcardClass15 = textBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        char[] charArray10 = textBuffer1.getTextBuffer();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray2 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        char[] charArray7 = textBuffer1.contentsAsArray();
        char[] charArray8 = textBuffer1.contentsAsArray();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        java.lang.Class<?> wildcardClass10 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        int int7 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.setCurrentLength((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray10 = textBuffer1.contentsAsArray();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -35 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getCurrentSegmentSize();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        textBuffer1.append('a');
        char[] charArray9 = textBuffer1.getTextBuffer();
        textBuffer1.setCurrentLength(1000);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler12);
        textBuffer13.releaseBuffers();
        char[] charArray15 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer13.resetWithShared(charArray15, (int) '#', (int) (byte) 10);
        textBuffer13.resetWithString("");
        boolean boolean21 = textBuffer13.hasTextAsCharacters();
        int int22 = textBuffer13.size();
        char[] charArray23 = textBuffer13.contentsAsArray();
        textBuffer1.resetWithShared(charArray23, 1, 0);
        java.lang.String str27 = textBuffer1.toString();
        textBuffer1.releaseBuffers();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithString("hi!");
        java.lang.String str9 = textBuffer1.toString();
        textBuffer1.ensureNotShared();
        java.lang.String str11 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        char[] charArray7 = textBuffer1.contentsAsArray();
        char[] charArray8 = textBuffer1.contentsAsArray();
        textBuffer1.append('4');
        textBuffer1.append(' ');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        textBuffer11.setCurrentLength(1);
        boolean boolean14 = textBuffer11.hasTextAsCharacters();
        int int15 = textBuffer11.getTextOffset();
        char[] charArray16 = textBuffer11.contentsAsArray();
        char[] charArray17 = textBuffer11.contentsAsArray();
        textBuffer11.resetWithString("\000\000\000\000\000\000\000\000\000\000");
        java.lang.String str20 = textBuffer11.contentsAsString();
        char[] charArray21 = textBuffer11.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray21, 3, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str20, "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        textBuffer1.resetWithString("hi!");
        textBuffer1.releaseBuffers();
        int int8 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        textBuffer10.releaseBuffers();
        int int12 = textBuffer10.getTextOffset();
        textBuffer10.ensureNotShared();
        textBuffer10.resetWithEmpty();
        java.lang.String str15 = textBuffer10.contentsAsString();
        char[] charArray16 = textBuffer10.getTextBuffer();
        char[] charArray17 = textBuffer10.getTextBuffer();
        textBuffer1.resetWithShared(charArray17, 0, (int) '4');
        java.lang.Class<?> wildcardClass21 = charArray17.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        textBuffer8.releaseBuffers();
        int int10 = textBuffer8.getTextOffset();
        textBuffer8.ensureNotShared();
        textBuffer8.resetWithEmpty();
        java.lang.String str13 = textBuffer8.contentsAsString();
        char[] charArray14 = textBuffer8.getTextBuffer();
        char[] charArray15 = textBuffer8.getTextBuffer();
        char[] charArray16 = textBuffer8.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray16, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 53 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        char[] charArray6 = textBuffer1.getTextBuffer();
        textBuffer1.releaseBuffers();
        char[] charArray8 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithEmpty();
        java.lang.String str10 = textBuffer1.toString();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.releaseBuffers();
        textBuffer1.setCurrentLength((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray11 = textBuffer1.expandCurrentSegment(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        java.lang.String str10 = textBuffer1.toString();
        int int11 = textBuffer1.getTextOffset();
        int int12 = textBuffer1.size();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append('a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        textBuffer1.append('a');
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        char[] charArray9 = textBuffer1.getCurrentSegment();
        char[] charArray10 = textBuffer1.getTextBuffer();
        char[] charArray12 = textBuffer1.expandCurrentSegment((int) (short) 100);
        int int13 = textBuffer1.getTextOffset();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        textBuffer1.resetWithString("");
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        textBuffer10.setCurrentLength(1);
        char[] charArray13 = textBuffer10.getCurrentSegment();
        boolean boolean14 = textBuffer10.hasTextAsCharacters();
        textBuffer10.append('a');
        boolean boolean17 = textBuffer10.hasTextAsCharacters();
        char[] charArray18 = textBuffer10.getCurrentSegment();
        boolean boolean19 = textBuffer10.hasTextAsCharacters();
        char[] charArray20 = textBuffer10.contentsAsArray();
        char[] charArray21 = textBuffer10.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray21, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 35 out of bounds for char[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { 'a' });
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        int int3 = textBuffer1.getTextOffset();
        textBuffer1.ensureNotShared();
        textBuffer1.resetWithEmpty();
        java.lang.String str6 = textBuffer1.contentsAsString();
        char[] charArray7 = textBuffer1.getTextBuffer();
        char[] charArray8 = textBuffer1.getTextBuffer();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        textBuffer11.releaseBuffers();
        char[] charArray13 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer11.resetWithShared(charArray13, (int) '#', (int) (byte) 10);
        textBuffer11.resetWithString("");
        char[] charArray19 = textBuffer11.getTextBuffer();
        char[] charArray20 = textBuffer11.getCurrentSegment();
        textBuffer11.resetWithString("");
        char[] charArray23 = textBuffer11.contentsAsArray();
        java.lang.String str24 = textBuffer11.contentsAsString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer26 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler25);
        textBuffer26.setCurrentLength(1);
        boolean boolean29 = textBuffer26.hasTextAsCharacters();
        int int30 = textBuffer26.getTextOffset();
        char[] charArray31 = textBuffer26.emptyAndGetCurrentSegment();
        textBuffer26.setCurrentLength(262144);
        textBuffer26.setCurrentLength((int) (short) 10);
        textBuffer26.releaseBuffers();
        char[] charArray38 = textBuffer26.expandCurrentSegment(100);
        char[] charArray39 = textBuffer26.contentsAsArray();
        textBuffer11.resetWithShared(charArray39, 1, 101);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray39, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 33 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] {});
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        char[] charArray11 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithString("hi!");
        boolean boolean14 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithString(" ");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer9 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler8);
        textBuffer9.releaseBuffers();
        char[] charArray11 = textBuffer9.contentsAsArray();
        int int12 = textBuffer9.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler13 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer14 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler13);
        textBuffer14.setCurrentLength(1);
        boolean boolean17 = textBuffer14.hasTextAsCharacters();
        int int18 = textBuffer14.getTextOffset();
        char[] charArray19 = textBuffer14.contentsAsArray();
        char[] charArray20 = textBuffer14.contentsAsArray();
        textBuffer14.setCurrentLength(10);
        textBuffer14.ensureNotShared();
        char[] charArray24 = textBuffer14.contentsAsArray();
        textBuffer9.resetWithShared(charArray24, (int) (byte) 1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray24, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 98 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] {});
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("hi!");
        java.lang.String str5 = textBuffer1.toString();
        char[] charArray7 = textBuffer1.expandCurrentSegment((int) (byte) 10);
        textBuffer1.setCurrentLength(35);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        textBuffer11.setCurrentLength(1);
        char[] charArray14 = textBuffer11.getCurrentSegment();
        boolean boolean15 = textBuffer11.hasTextAsCharacters();
        textBuffer11.append('a');
        boolean boolean18 = textBuffer11.hasTextAsCharacters();
        char[] charArray19 = textBuffer11.getCurrentSegment();
        boolean boolean20 = textBuffer11.hasTextAsCharacters();
        char[] charArray21 = textBuffer11.contentsAsArray();
        char[] charArray22 = textBuffer11.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray22, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 10 out of bounds for char[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { 'a' });
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        textBuffer10.setCurrentLength(1);
        char[] charArray13 = textBuffer10.getCurrentSegment();
        boolean boolean14 = textBuffer10.hasTextAsCharacters();
        textBuffer10.append('a');
        boolean boolean17 = textBuffer10.hasTextAsCharacters();
        char[] charArray18 = textBuffer10.getCurrentSegment();
        boolean boolean19 = textBuffer10.hasTextAsCharacters();
        char[] charArray20 = textBuffer10.contentsAsArray();
        char[] charArray21 = textBuffer10.contentsAsArray();
        textBuffer1.resetWithShared(charArray21, 1, 0);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer26 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler25);
        textBuffer26.releaseBuffers();
        textBuffer26.resetWithString("hi!");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler30 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer31 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler30);
        textBuffer31.setCurrentLength(1);
        char[] charArray34 = textBuffer31.getCurrentSegment();
        char[] charArray35 = textBuffer31.contentsAsArray();
        char[] charArray36 = textBuffer31.getTextBuffer();
        textBuffer26.resetWithShared(charArray36, 100, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray36, 1000, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] {});
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] {});
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        textBuffer1.ensureNotShared();
        textBuffer1.setCurrentLength(97);
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray16 = textBuffer1.finishCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        textBuffer1.resetWithString("hi!");
        textBuffer1.resetWithEmpty();
        char[] charArray6 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        textBuffer8.setCurrentLength(1);
        char[] charArray11 = textBuffer8.getCurrentSegment();
        char[] charArray12 = textBuffer8.contentsAsArray();
        char[] charArray13 = textBuffer8.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray13, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        textBuffer1.append(' ');
        java.lang.String str6 = textBuffer1.contentsAsString();
        char[] charArray7 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray8 = textBuffer1.getCurrentSegment();
        char[] charArray9 = textBuffer1.getTextBuffer();
        java.lang.String str10 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        textBuffer12.releaseBuffers();
        int int14 = textBuffer12.getTextOffset();
        textBuffer12.ensureNotShared();
        textBuffer12.resetWithEmpty();
        java.lang.String str17 = textBuffer12.contentsAsString();
        char[] charArray18 = textBuffer12.getTextBuffer();
        char[] charArray19 = textBuffer12.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray19, (-1), 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for char[1000]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] {});
        org.junit.Assert.assertNotNull(charArray19);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.contentsAsArray();
        char[] charArray7 = textBuffer1.contentsAsArray();
        textBuffer1.setCurrentLength(10);
        char[] charArray10 = textBuffer1.getCurrentSegment();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal11 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler3 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler3);
        textBuffer4.setCurrentLength(1);
        char[] charArray7 = textBuffer4.getCurrentSegment();
        boolean boolean8 = textBuffer4.hasTextAsCharacters();
        char[] charArray9 = textBuffer4.getCurrentSegment();
        textBuffer1.resetWithShared(charArray9, 1, (int) '#');
        char[] charArray13 = textBuffer1.getCurrentSegment();
        boolean boolean14 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer16 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler15);
        char[] charArray17 = textBuffer16.getCurrentSegment();
        char[] charArray19 = textBuffer16.expandCurrentSegment((int) (byte) 1);
        char[] charArray20 = textBuffer16.emptyAndGetCurrentSegment();
        boolean boolean21 = textBuffer16.hasTextAsCharacters();
        textBuffer16.releaseBuffers();
        boolean boolean23 = textBuffer16.hasTextAsCharacters();
        boolean boolean24 = textBuffer16.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer26 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler25);
        textBuffer26.setCurrentLength(1);
        char[] charArray29 = textBuffer26.getCurrentSegment();
        char[] charArray30 = textBuffer26.contentsAsArray();
        int int31 = textBuffer26.getTextOffset();
        int int32 = textBuffer26.getCurrentSegmentSize();
        textBuffer26.releaseBuffers();
        char[] charArray34 = textBuffer26.getCurrentSegment();
        textBuffer16.resetWithCopy(charArray34, 0, (int) (byte) 1);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler38 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer39 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler38);
        char[] charArray40 = textBuffer39.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler41 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer42 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler41);
        textBuffer42.setCurrentLength(1);
        char[] charArray45 = textBuffer42.getCurrentSegment();
        boolean boolean46 = textBuffer42.hasTextAsCharacters();
        char[] charArray47 = textBuffer42.getCurrentSegment();
        textBuffer39.resetWithShared(charArray47, 1, (int) '#');
        char[] charArray51 = textBuffer39.getCurrentSegment();
        char[] charArray52 = textBuffer39.emptyAndGetCurrentSegment();
        textBuffer16.resetWithShared(charArray52, (int) (short) 0, 262144);
        textBuffer1.resetWithCopy(charArray52, (int) (byte) 100, (int) (short) 100);
        int int59 = textBuffer1.getTextOffset();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler60 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer61 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler60);
        textBuffer61.setCurrentLength(1);
        char[] charArray64 = textBuffer61.getCurrentSegment();
        boolean boolean65 = textBuffer61.hasTextAsCharacters();
        textBuffer61.append('a');
        boolean boolean68 = textBuffer61.hasTextAsCharacters();
        char[] charArray69 = textBuffer61.getCurrentSegment();
        boolean boolean70 = textBuffer61.hasTextAsCharacters();
        int int71 = textBuffer61.size();
        char[] charArray72 = textBuffer61.contentsAsArray();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler73 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer74 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler73);
        textBuffer74.setCurrentLength(1);
        char[] charArray77 = textBuffer74.getCurrentSegment();
        char[] charArray78 = textBuffer74.contentsAsArray();
        char[] charArray79 = textBuffer74.getTextBuffer();
        textBuffer61.resetWithShared(charArray79, 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.resetWithCopy(charArray79, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 10 out of bounds for char[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] {});
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertArrayEquals(charArray72, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray77);
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertArrayEquals(charArray78, new char[] {});
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertArrayEquals(charArray79, new char[] {});
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        textBuffer1.releaseBuffers();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("hi!");
        java.lang.String str5 = textBuffer1.toString();
        textBuffer1.append('#');
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer10 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler9);
        textBuffer10.setCurrentLength(1);
        char[] charArray13 = textBuffer10.getCurrentSegment();
        char[] charArray14 = textBuffer10.contentsAsArray();
        int int15 = textBuffer10.getTextOffset();
        int int16 = textBuffer10.getCurrentSegmentSize();
        textBuffer10.resetWithEmpty();
        char[] charArray18 = textBuffer10.emptyAndGetCurrentSegment();
        textBuffer1.append(charArray18, 10, 97);
        char[] charArray22 = textBuffer1.getTextBuffer();
        // The following exception was thrown during execution in test generation
        try {
            double double23 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray22);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        boolean boolean10 = textBuffer1.hasTextAsCharacters();
        java.lang.String str11 = textBuffer1.toString();
        char[] charArray12 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.Class<?> wildcardClass13 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        textBuffer1.resetWithString("hi!");
        java.lang.String str5 = textBuffer1.toString();
        java.lang.String str6 = textBuffer1.contentsAsString();
        char[] charArray7 = textBuffer1.getTextBuffer();
        char[] charArray8 = null;
        textBuffer1.resetWithShared(charArray8, (int) 'a', 0);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'h', 'i', '!' });
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        textBuffer7.setCurrentLength(1);
        char[] charArray10 = textBuffer7.getCurrentSegment();
        boolean boolean11 = textBuffer7.hasTextAsCharacters();
        char[] charArray12 = textBuffer7.getCurrentSegment();
        char[] charArray13 = textBuffer7.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray13, (int) (byte) 100, 10);
        textBuffer1.setCurrentLength((int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        boolean boolean6 = textBuffer1.hasTextAsCharacters();
        textBuffer1.releaseBuffers();
        boolean boolean8 = textBuffer1.hasTextAsCharacters();
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        textBuffer11.setCurrentLength(1);
        char[] charArray14 = textBuffer11.getCurrentSegment();
        char[] charArray15 = textBuffer11.contentsAsArray();
        int int16 = textBuffer11.getTextOffset();
        int int17 = textBuffer11.getCurrentSegmentSize();
        textBuffer11.releaseBuffers();
        char[] charArray19 = textBuffer11.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray19, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("hi!", 3, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 3, end 1002, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(charArray19);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        boolean boolean9 = textBuffer1.hasTextAsCharacters();
        int int10 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        int int12 = textBuffer1.getTextOffset();
        char[] charArray13 = textBuffer1.getTextBuffer();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(charArray13);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.releaseBuffers();
        char[] charArray3 = com.fasterxml.jackson.core.util.TextBuffer.NO_CHARS;
        textBuffer1.resetWithShared(charArray3, (int) '#', (int) (byte) 10);
        textBuffer1.resetWithString("");
        char[] charArray9 = textBuffer1.getTextBuffer();
        char[] charArray10 = textBuffer1.getCurrentSegment();
        boolean boolean11 = textBuffer1.hasTextAsCharacters();
        int int12 = textBuffer1.getTextOffset();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", 100, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 100, end 111, length 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        int int7 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal8 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        boolean boolean4 = textBuffer1.hasTextAsCharacters();
        int int5 = textBuffer1.getTextOffset();
        char[] charArray6 = textBuffer1.contentsAsArray();
        char[] charArray7 = textBuffer1.contentsAsArray();
        textBuffer1.resetWithString("\000\000\000\000\000\000\000\000\000\000");
        java.lang.String str10 = textBuffer1.contentsAsString();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray11 = textBuffer1.expandCurrentSegment();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str10, "\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        java.lang.String str4 = textBuffer1.toString();
        textBuffer1.resetWithEmpty();
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        textBuffer8.setCurrentLength(1);
        char[] charArray11 = textBuffer8.getCurrentSegment();
        boolean boolean12 = textBuffer8.hasTextAsCharacters();
        char[] charArray13 = textBuffer8.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler14 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer15 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler14);
        textBuffer15.releaseBuffers();
        int int17 = textBuffer15.getTextOffset();
        textBuffer15.ensureNotShared();
        textBuffer15.resetWithEmpty();
        java.lang.String str20 = textBuffer15.contentsAsString();
        char[] charArray21 = textBuffer15.getTextBuffer();
        char[] charArray22 = textBuffer15.getCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer24 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler23);
        textBuffer24.setCurrentLength(1);
        boolean boolean27 = textBuffer24.hasTextAsCharacters();
        int int28 = textBuffer24.getTextOffset();
        char[] charArray29 = textBuffer24.emptyAndGetCurrentSegment();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler30 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer31 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler30);
        textBuffer31.releaseBuffers();
        char[] charArray33 = textBuffer31.getCurrentSegment();
        textBuffer24.resetWithCopy(charArray33, 97, 100);
        textBuffer15.resetWithShared(charArray33, 100, 0);
        textBuffer8.append(charArray33, (int) (byte) 1, 35);
        textBuffer1.append(charArray33, 1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass46 = charArray33.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] {});
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray4 = textBuffer1.expandCurrentSegment((int) (byte) 1);
        java.lang.String str5 = textBuffer1.toString();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        char[] charArray8 = textBuffer7.getCurrentSegment();
        char[] charArray9 = textBuffer7.getCurrentSegment();
        textBuffer1.resetWithCopy(charArray9, (int) '4', 1);
        char[] charArray13 = textBuffer1.contentsAsArray();
        char[] charArray14 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.String str15 = textBuffer1.toString();
        java.lang.Class<?> wildcardClass16 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '\000' });
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        java.lang.String str4 = textBuffer1.toString();
        textBuffer1.resetWithString("hi!");
        boolean boolean7 = textBuffer1.hasTextAsCharacters();
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("4", (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin -1, end -2, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        char[] charArray2 = textBuffer1.getCurrentSegment();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        java.lang.String str4 = textBuffer1.toString();
        textBuffer1.resetWithString("hi!");
        int int7 = textBuffer1.size();
        int int8 = textBuffer1.getTextOffset();
        java.lang.Class<?> wildcardClass9 = textBuffer1.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.setCurrentLength(1);
        char[] charArray4 = textBuffer1.getCurrentSegment();
        char[] charArray5 = textBuffer1.contentsAsArray();
        int int6 = textBuffer1.getTextOffset();
        int int7 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithEmpty();
        char[] charArray9 = textBuffer1.emptyAndGetCurrentSegment();
        java.lang.Class<?> wildcardClass10 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
}

